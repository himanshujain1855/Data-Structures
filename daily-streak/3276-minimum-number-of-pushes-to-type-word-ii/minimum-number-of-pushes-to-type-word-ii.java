class Solution {
    public int minimumPushes(String word) {
        int len = word.length();

        int[] chars = new int[26];
        for (int i = 0; i < len; i++) {
            chars[word.charAt(i) - 97]++;
        }
        Arrays.sort(chars);
        int pushes = 0;

        for (int i = 25; i >= 0; i--) {
            int mul;
            int mulDeciderIndex = 25 - i;

            if (mulDeciderIndex <= 7) {
                mul = 1;
            } else if (mulDeciderIndex <= 15) {
                mul = 2;
            } else if (mulDeciderIndex <= 23) {
                mul = 3;
            } else {
                mul = 4;
            }
            pushes += (mul * chars[i]);
        }

        return pushes;
    }
}