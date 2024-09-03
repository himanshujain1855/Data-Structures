class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        int len = nums.length;
        if (len < 4)
            return quadruplets;

        Arrays.sort(nums);
        Set<List<Integer>> quadrupletsSet = new HashSet<>();
        for (int l = 0; l < len - 3; l++) {
            for (int i = l + 1; i < len - 2; i++) {
                int start = i + 1;
                int end = len - 1;
                while (start < end) {
                    double expectedQuadruplet = (double) nums[l] + (double) nums[i] + (double) nums[start]
                            + (double) nums[end];

                    if (expectedQuadruplet == target) {
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[l]);
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[start]);
                        quadruplet.add(nums[end]);
                        Collections.sort(quadruplet);
                        quadrupletsSet.add(quadruplet);
                        end--;
                        start++;
                    } else if (expectedQuadruplet > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        quadruplets.addAll(quadrupletsSet);
        return quadruplets;
    }
}