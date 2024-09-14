class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;

        int n = nums.length;

        if (n == 1)
            return 1;

        int maxAndValue = 0;
        int streak=0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maxAndValue){
                maxAndValue = nums[i];
                streak=0;
                ans=0;
            }

            if(nums[i]==maxAndValue){
                streak++;
                if(streak>ans) ans=streak;
            }else{
                streak=0;
            }
        }

        return ans;
    }
}