class Solution {
    public static String countOfAtoms(String formula) {
        Stack<HashMap<String, Integer>> stack = new Stack<>();

        int len = formula.length();
        if (len == 1)
            return formula;
        stack.push(new HashMap<>());

        for (int i = 0; i < len; i++) {
            char charAt = formula.charAt(i);

            if ('(' == charAt) {
                stack.push(new HashMap<>());
            } else if (')' == charAt) {
                String multiplierString = "";
                int multiplier = 1;
                i++;
                while (i < len && Character.isDigit(formula.charAt(i))) {
                    multiplierString += formula.charAt(i);
                    i++;
                }

                if (multiplierString != "") {
                    multiplier = Integer.parseInt(multiplierString);
                }

                HashMap<String, Integer> peek = stack.pop();

                for (String key : peek.keySet()) {
                    peek.put(key, peek.get(key) * multiplier);
                }
                for (String key : peek.keySet()) {
                    stack.peek().put(key, stack.peek().getOrDefault(key, 0) + peek.get(key));
                }

                i--;
            } else {
                String atom = formula.charAt(i) + "";
                i++;
                while (i < len && Character.isLowerCase(formula.charAt(i))) {
                    atom += formula.charAt(i);
                    i++;
                }
                String multiplierString = "";
                int multiplier = 1;

                while (i < len && Character.isDigit(formula.charAt(i))) {
                    multiplierString += formula.charAt(i);
                    i++;
                }

                if (multiplierString != "")
                    multiplier = Integer.parseInt(multiplierString);

                if (stack.peek().containsKey(atom)) {
                    stack.peek().put(atom, stack.peek().get(atom) + multiplier);
                } else {
                    stack.peek().put(atom, multiplier);
                }
                i--;
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(stack.peek());

        String ans = "";
        for (String sortedKey : sortedMap.keySet()) {
            if (sortedMap.get(sortedKey) == 1) {
                ans += sortedKey;
            } else {
                ans += sortedKey + sortedMap.get(sortedKey);
            }
        }
        return ans;
    }
}