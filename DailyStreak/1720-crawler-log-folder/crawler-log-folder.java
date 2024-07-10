class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;

        for (String log : logs) {
            if (log.charAt(0)!='.') {
                ans++;
            } else if (ans > 0 & "../".equals(log)) {
                ans--;
            }
        }

        return ans;
    }
}