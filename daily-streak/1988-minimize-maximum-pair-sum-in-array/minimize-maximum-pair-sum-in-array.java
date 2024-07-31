class Solution {
    public int minPairSum(int[] nums) {
        int len=nums.length;
        int maxMin=-1;
        int start=0;
        int end=len-1;

        Arrays.sort(nums);
        while(start < end){
            maxMin=Math.max(nums[start]+nums[end],maxMin);
            start++;
            end--;
        }

        return maxMin;
}
}