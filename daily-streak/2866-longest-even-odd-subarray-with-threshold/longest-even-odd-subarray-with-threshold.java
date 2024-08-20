class Solution {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
         int n = nums.length;
        int start = 0;

        int max = 0;
        int curr = 0;
        boolean odd = false;
        for (int i = start; i < n; i++) {
            if (nums[i] > threshold) {
                curr = 0;
                odd = false;
                continue;
            }

            if (odd) {
                if (nums[i] % 2 != 0) {
                    curr++;
                    if (curr > max) {
                        max = curr;
                    }
                    odd = false;
                } else {
                    curr = 1;
                }
            } else {
                if (nums[i] % 2 == 0) {
                    curr++;
                    if (curr > max) {
                        max = curr;
                    }
                    odd = true;
                } else {
                    curr = 0;
                    odd = false;
                }

            }
        }

        return max;
    }
}