class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for (String log : logs) {
            char firstChar = log.charAt(0);
            if ((firstChar >= 97 && firstChar <= 122) ||
                    (firstChar >= 48 && firstChar <= 57)) {
                count++;
            } else if ("../".equals(log)) {
                if (count != 0) {
                    count--;
                }
            }
        }

        return count;
    }
}