class Solution {
    public int minPairSum(int[] nums) {
        int maxMin=-1;
        int start=0;
        int end=nums.length-1;

        Arrays.sort(nums);
        while(start < end){
            int min=nums[start++]+nums[end--];
            if(min > maxMin) maxMin=min;
        }

        return maxMin;
}
}