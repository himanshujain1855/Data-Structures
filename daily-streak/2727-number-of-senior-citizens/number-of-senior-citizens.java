class Solution {
    public int countSeniors(String[] details) {
        int len=details.length;

        int ans=0;
        
        for(int i=0;i<len;i++){
            String passDetail=details[i];
            char tens = passDetail.charAt(11);
            char ones = passDetail.charAt(12);
            if (tens > '6' || (tens == '6' && ones > '0')) {
                ans++;
            }
        }

        return ans;
    }
}