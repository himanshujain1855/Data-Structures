class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;

        int majElement = nums[0];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (count == 0) {
                majElement = nums[i];
                count++;
            } else if (nums[i] != majElement && count != 0) {
                count--;
            } else {
                count++;
            }
        }

        return majElement;
    }
}