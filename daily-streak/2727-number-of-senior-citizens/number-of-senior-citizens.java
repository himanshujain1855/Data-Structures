class Solution {
    public int countSeniors(String[] details) {
        int len=details.length;

        int ans=0;

        for(int i=0;i<len;i++){
            char eles = details[i].charAt(11);
            char twels = details[i].charAt(12);
            if(Integer.parseInt(eles+""+twels)>60) ans++;
        }

        return ans;
    }
}