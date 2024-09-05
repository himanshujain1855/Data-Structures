class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;

        Arrays.sort(nums);

        Integer currNearSum = null;
        for (int i = 0; i < len; i++) {

            int lo = i + 1;

            int hi = len - 1;

            while (lo < hi) {
                int tempSum = nums[i] + nums[lo] + nums[hi];

                if (tempSum == target)
                    return target;

                if (currNearSum != null) {
                    if ((Math.abs(target - tempSum)) < Math.abs(target - currNearSum)) {
                        currNearSum = tempSum;
                    }
                } else {
                    currNearSum = tempSum;
                }

                if (tempSum > target) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return currNearSum;
    }
}