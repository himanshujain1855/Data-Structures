class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        int len = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int start = i + 1;
            int end = len - 1;
            while (start < end) {
                int expectedTriplet = nums[i] + nums[start] + nums[end];

                if (expectedTriplet == 0) {
                    triplets.add(List.of(nums[i], nums[start], nums[end]));

                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    end--;
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    start++;
                } else if (expectedTriplet > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return triplets;
    }
}