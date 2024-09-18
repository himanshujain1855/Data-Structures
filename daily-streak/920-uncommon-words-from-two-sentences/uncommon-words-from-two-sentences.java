class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList();

        String[] s1Words = s1.split(" ");
        String[] s2Words = s2.split(" ");

        HashMap<String, Integer> s1Map = new HashMap();
        HashMap<String, Integer> s2Map = new HashMap();

        for (String word : s1Words) {
            s1Map.put(word, s1Map.getOrDefault(word, 0) + 1);
        }

        for (String word : s2Words) {
            s2Map.put(word, s2Map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> map : s1Map.entrySet()) {
            if (map.getValue() == 1) {
                if (!s2Map.containsKey(map.getKey())) {
                    ans.add(map.getKey());
                }
            }
        }

        for (Map.Entry<String, Integer> map : s2Map.entrySet()) {
            if (map.getValue() == 1) {
                if (!s1Map.containsKey(map.getKey())) {
                    ans.add(map.getKey());
                }
            }
        }
        int size = ans.size();

        String[] finalAns = new String[size];

        for (int i = 0; i < size; i++) {
            finalAns[i] = ans.get(i);
        }

        return finalAns;
    }
}