class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=0;
        
        int len=nums.length;
        
        int min=nums[0];

        for(int j=1;j<len;j++){
            if(nums[j] > min){
                maxDiff = Math.max(maxDiff,nums[j] - min);
            }
            min = Math.min(min,nums[j]);
        }

        if (maxDiff == 0) {
            return -1; // Return -1 if no valid difference was found
        }
        return maxDiff;
    }
}