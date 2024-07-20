class Solution {
    public static boolean isIsomorphic(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if (lenS != lenT) return false;

        int[] sMapping = new int[127];

        for (int i = 0; i <= 126; i++) {
            sMapping[i] = -1;
        }

        int[] tMapping = new int[127];

        for (int i = 0; i <= 126; i++) {
            tMapping[i] = -1;
        }
        
        boolean twice;
        char charAtS;
        char charAtT;
        for (int i = 0; i < lenS; i++) {
            twice = false;
            charAtS = s.charAt(i);
            charAtT = t.charAt(i);
            if (sMapping[charAtS] != -1) {
                twice = true;
                if (sMapping[charAtS] != charAtT) return false;
            } else {
                sMapping[charAtS] = charAtT;
            }

            if (tMapping[charAtT] != -1 && !twice) {
                return false;
            } else {
                tMapping[charAtT] = charAtS;
            }
        }

        return true;
    }
}