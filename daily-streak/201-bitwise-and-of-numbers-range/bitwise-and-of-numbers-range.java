class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=0;
        int bit=0;
        while(left!=0 || right!=0){
            
            if((left & 1)==1 && (right & 1)==1){
                ans = (ans | (1 << bit));
            }else if((left & 1)==1 || (right & 1)==1){
                ans=0;
            }
            bit++;
            left>>=1;
            right>>=1;
        }

        return ans;
    }
}