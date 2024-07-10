class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;

        // if it is dir then ans++ else if ../ then ans-- only if ans >0.
        for (String log : logs) {
            // if first char is not '.' means it is dir!
            if (log.charAt(0)!='.') ans++; 
            // ../ means moving from sub to parent dir!
            else if (ans > 0 & "../".equals(log))  ans--;
        }

        return ans;
    }
}