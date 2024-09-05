class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Integer currNearSum = null;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int tempSum = nums[i] + nums[j] + nums[k];
                    if (tempSum == target)
                        return target;
                    if (currNearSum != null) {
                        if ((Math.abs(target - tempSum)) < Math.abs(target - currNearSum)) {
                            currNearSum = tempSum;
                        }
                    } else {
                        currNearSum = tempSum;
                    }
                }
            }
        }
        return currNearSum;
    }
}