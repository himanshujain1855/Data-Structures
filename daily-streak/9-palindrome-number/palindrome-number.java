class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        if(x/10==0) return true;
        return x==rev(x);
    }

    public static int rev(int x){
        int revN=0;

        while(x>0){
            revN= revN*10 +  x%10;
            x=x/10;
        }

        return revN;
    }
}