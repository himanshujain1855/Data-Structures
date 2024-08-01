class Solution {
    public int countSeniors(String[] details) {
        int len=details.length;

        int ans=0;
        
        for(String passDetail:details){
            char tens = passDetail.charAt(11);
            char ones = passDetail.charAt(12);
            if(Integer.parseInt(tens+""+ones)>60) ans++;
            
        }

        return ans;
    }
}