class Solution {
    public int majorityElement(int[] nums) {
        int majorityElementMaxCount = -1;
        int len = nums.length;

        Arrays.sort(nums);
        int majorityElement = nums[0];
        int tempCount = 0;
        int tempElement = nums[0];
        for (int i = 0; i < len; i++) {
            if (nums[i] != tempElement) {
                if (tempCount > majorityElementMaxCount) {
                    majorityElement = tempElement;
                    majorityElementMaxCount = tempCount;
                }
                tempElement = nums[i];
                tempCount = 0;
            }
            tempCount++;
            if (i == len - 1 && tempCount > majorityElementMaxCount) {
                majorityElement = nums[i];
            }
        }

        return majorityElement;
    }
}