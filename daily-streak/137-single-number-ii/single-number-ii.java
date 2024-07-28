class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;

        for(int i=0;i<32;i++){
            int zeros=0;
            
            int ones=0;


            for(int num:nums){
                int mask= (1 << i);

                if((num & mask)!=0){
                    ones++;
                }else{
                    zeros++;
                }
            }

            zeros=zeros % 3;
            ones=ones % 3;

            if((ones % 3) > 0){
                ans = (ans | (1 << i)); 
            }else{
                ans = ((ans & ~(1 << i))); 
            }
        }

        return ans;
    }
}