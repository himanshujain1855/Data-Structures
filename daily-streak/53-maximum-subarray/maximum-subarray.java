class Solution {

    public int maxSubArray(int[] nums) {
        int realMax=nums[0];
        int currentMax=nums[0];
        int len=nums.length;

        for(int i=1;i<len;i++){
            currentMax=Math.max(currentMax+nums[i],nums[i]);
            if(currentMax>realMax) realMax=currentMax;
        }

        return realMax;
    }
}
