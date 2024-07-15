class Solution {
    public static String countOfAtoms(String formula) {
        Stack<HashMap<String, Integer>> stack = new Stack<>();

        int len = formula.length();
        if (len == 1) return formula;
        stack.push(new HashMap<>());

        for (int i = 0; i < len; i++) {
            char charAt = formula.charAt(i);

            if ('(' == charAt) {
                stack.push(new HashMap<>());
            } else if (')' == charAt) {
                StringBuilder multiplierString = new StringBuilder();
                int multiplier = 1;
                i++;
                while (i < len && Character.isDigit(formula.charAt(i))) {
                    multiplierString.append(formula.charAt(i));
                    i++;
                }

                if (!multiplierString.isEmpty()) multiplier = Integer.parseInt(multiplierString.toString());

                HashMap<String, Integer> peek = stack.pop();

                for (String key : peek.keySet()) {
                    peek.put(key, peek.get(key) * multiplier);
                }
                for (String key : peek.keySet()) {
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + peek.get(key));
                }

                i--;
            } else {
                StringBuilder atom = new StringBuilder(formula.charAt(i)+"");
                i++;
                while (i < len && Character.isLowerCase(formula.charAt(i))) {
                    atom.append(formula.charAt(i));
                    i++;
                }
                StringBuilder multiplierString = new StringBuilder();
                int multiplier = 1;

                while (i < len && Character.isDigit(formula.charAt(i))) {
                    multiplierString.append(formula.charAt(i));
                    i++;
                }

                if (!multiplierString.isEmpty()) multiplier = Integer.parseInt(multiplierString.toString());

                stack.peek().put(atom.toString(), stack.peek().getOrDefault(atom.toString(),0) + multiplier);
                i--;
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(stack.peek());

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<String, Integer> map: sortedMap.entrySet()) {
            ans.append(map.getKey());
            if (map.getValue() != 1) {
                ans.append(map.getValue());
            }
        }
        return ans.toString();
    }
}