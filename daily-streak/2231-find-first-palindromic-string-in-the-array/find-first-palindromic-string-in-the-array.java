class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalinDrome(word))
                return word;
        }
        return "";
    }

    public boolean isPalinDrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}