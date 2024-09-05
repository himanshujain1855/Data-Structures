class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        int len = nums.length;
        if (len < 4)
            return quadruplets;
        Arrays.sort(nums);

        for (int l = 0; l < len; l++) {
            if (l > 0 && nums[l] == nums[l - 1])
                continue;
            for (int i = l + 1; i < len; i++) {
                if (i > l + 1 && nums[i] == nums[i - 1])
                    continue;
                int start = i + 1;
                int end = len - 1;
                while (start < end) {
                    double expectedQuadruplet = (double) nums[l] + (double) nums[i] + (double) nums[start]
                            + (double) nums[end];

                    if (expectedQuadruplet == target) {
                        quadruplets.add(List.of(nums[l],nums[i], nums[start], nums[end]));
                        end--;
                        start++;

                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }

                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }

                    } else if (expectedQuadruplet > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return quadruplets;
    }
}