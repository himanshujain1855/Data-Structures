class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        if(x/10==0) return true;

        String sX=String.valueOf(x);

        int len=sX.length();

        for(int i=0;i<len/2;i++){
            if(sX.charAt(i)!=sX.charAt(len-i-1)) return false;
        }

        return true;
    }
}