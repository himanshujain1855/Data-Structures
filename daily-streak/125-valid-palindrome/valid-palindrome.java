class Solution {
    public boolean isPalindrome(String s) {
        // s=convertToAlphanumeric(s);
        return isPalinDrome(s);
    }

    public static boolean isPalinDrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            while (!Character.isLetterOrDigit(word.charAt(start)) && start < end)
                start++;
            while (!Character.isLetterOrDigit(word.charAt(end)) && start < end)
                end--;

            if (Character.toLowerCase(word.charAt(start)) != Character.toLowerCase(word.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}