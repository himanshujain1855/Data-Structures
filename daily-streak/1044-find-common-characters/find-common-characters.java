class Solution {
    // obersavation based solution

    public static List<String> commonChars(String[] words) {
        int lastIntersection[] = freq(words[0]);

        int len = words.length;

        for (int i = 1; i < len; i++) {
            lastIntersection = intersection(lastIntersection, freq(words[i]));
        }

        List<String> ans = new ArrayList();

        for (int i = 0; i < 26; i++) {
            if (lastIntersection[i] > 0) {
                char c = (char) (i + 97);
                for (int j = 0; j < lastIntersection[i]; j++) {
                    ans.add(c + "");
                }
            }
        }

        return ans;
    }

    public static int[] intersection(int a[], int b[]) {
        int common[] = new int[26];

        for (int i = 0; i < 26; i++) {
            common[i] = Math.min(a[i], b[i]);
        }

        return common;
    }

    public static int[] freq(String str) {
        int freq[] = new int[26];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            freq[str.charAt(i) - 97]++;
        }

        return freq;
    }
}