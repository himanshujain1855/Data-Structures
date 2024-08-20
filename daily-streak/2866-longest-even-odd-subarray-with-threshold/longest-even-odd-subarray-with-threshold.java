class Solution {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int start = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > threshold)
                continue;
            if (nums[i] % 2 == 0) {
                start = i;
                break;
            }
        }
        if (start == -1)
            return 0;

        int max = 1;
        int curr = 1;
        boolean odd = true;
        for (int i = start + 1; i < n; i++) {
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
                    odd = true;
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