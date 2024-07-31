class Solution {
    public int[] numberOfPairs(int[] nums) {
        int len = nums.length;

        Arrays.sort(nums);
        int pairs = 0;
        int i=1;
        while(i<len){
            if (nums[i] == nums[i - 1]) {
                pairs++;
                i++;
            }
            i++;
        }

        return new int[] { pairs, len - (pairs*2) };
    }
}