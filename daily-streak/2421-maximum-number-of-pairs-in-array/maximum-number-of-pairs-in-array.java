class Solution {
    public int[] numberOfPairs(int[] nums) {
        int len = nums.length;

        if (len == 1)
            return new int[] { 0, 1 };

        Arrays.sort(nums);
        int pairs = 0;
        int leftElement = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                pairs++;
                i++;
            }
        }

        return new int[] { pairs, len - (pairs*2) };
    }
}