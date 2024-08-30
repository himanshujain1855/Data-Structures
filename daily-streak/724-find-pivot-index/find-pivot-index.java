class Solution {
    public int pivotIndex(int[] nums) {
        int prefixSum=0;
        
        int len=nums.length;
        
        int arrSum=0;

        for(int i=0;i<len;i++){
            arrSum+=nums[i];
        }

        int prefSum=0;

        for(int i=0;i<len;i++){
            if(arrSum-prefSum-nums[i]==prefSum) return i;
            prefSum+=nums[i];
        }

        return -1;
    }
}