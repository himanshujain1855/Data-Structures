class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;

        for(int i=0;i<32;i++){
            int ones=0;
            int mask= (1 << i);
            for(int num:nums){
                if((num & mask)!=0){
                    ones++;
                }
            }
            if((ones % 3) > 0){
                ans = (ans | (1 << i)); 
            }
        }

        return ans;
    }
}