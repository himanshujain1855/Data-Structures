class Solution {
    public boolean isPalindrome(String s) {
        // s=convertToAlphanumeric(s);
        return isPalinDrome(s);
    }

    public static boolean isPalinDrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            char startChar =word.charAt(start);
            char endChar = word.charAt(end);
            boolean startContinue=false;

            if (!(Character.isDigit(startChar) || Character.isAlphabetic(startChar))) {
                start++;
                startContinue=true;
            }

            if (!(Character.isDigit(endChar) || Character.isAlphabetic(endChar))) {
                end--;
                continue;
            }

            if(startContinue) continue;
            startChar = Character.toLowerCase(word.charAt(start));
            endChar = Character.toLowerCase(word.charAt(end));
            if (startChar != endChar) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}