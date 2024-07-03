class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;

        if(n<=4) return 0;
        Arrays.sort(nums);

        int ans=nums[n-4]-nums[0];
        ans=Math.min(ans,nums[n-3]-nums[1]);
        ans=Math.min(ans,nums[n-2]-nums[2]);
        ans=Math.min(ans,nums[n-1]-nums[3]);

        return ans;
    }
}