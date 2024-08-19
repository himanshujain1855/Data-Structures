class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int len = nums.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}