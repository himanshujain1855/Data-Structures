class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=0;
        
        int len=nums.length;
        
        int min=nums[0];

        for(int j=1;j<len;j++){
            int curr=nums[j];
            if(curr > min){
                if(curr - min > maxDiff){
                    maxDiff = curr - min;
                }
                maxDiff = Math.max(maxDiff,curr - min);
            }else{
                min=curr;
            }
        }

        if (maxDiff == 0) {
            return -1; // Return -1 if no valid difference was found
        }
        return maxDiff;
    }
}