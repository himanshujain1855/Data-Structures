class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int sMax=-1;
        int maxI=0;

        for (int i = 0; i < len; i++) {
            if(nums[i]>max){
                sMax=max;
                max=nums[i];
                maxI=i;
            }else if(nums[i] > sMax && i!=maxI){
                sMax=nums[i];
            }
        }

        return (max - 1) * (sMax - 1);
    }
}