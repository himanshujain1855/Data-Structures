class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList();
        permute(nums,ans,0,nums.length);
        return ans;
    }

    public static void permute(int[] nums, List<List<Integer>> perms, int i, int len) {
        if (i == len) {
            perms.add(Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toList()));
            return;
        }

        for (int j = i; j < len; j++) {
            swap(nums, i, j);
            permute(nums, perms, i + 1, len);
            swap(nums, j, i);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}