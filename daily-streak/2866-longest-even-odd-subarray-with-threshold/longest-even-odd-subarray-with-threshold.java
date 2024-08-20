class Solution {
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int curr = 0;
        boolean odd = false;

        for (int num : nums) {
            if (num > threshold) {
                curr = 0;
                odd = false;
                continue;
            }

            if (odd) {
                if (num % 2 != 0) {
                    curr++;
                    if (curr > max) {
                        max = curr;
                    }
                    odd = false;
                } else {
                    curr = 1;
                }
            } else {
                if (num % 2 == 0) {
                    curr++;
                    if (curr > max) {
                        max = curr;
                    }
                    odd = true;
                } else {
                    curr = 0;
                }

            }
        }

        return max;
    }

}