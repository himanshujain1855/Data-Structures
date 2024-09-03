class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        int len = nums.length;
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int thirdElement = 0 - (nums[i] + nums[j]);
                if (numsMap.containsKey(thirdElement)) {
                    int index = numsMap.get(thirdElement);
                    if (i != index && j != index) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(thirdElement);
                        Collections.sort(triplet);
                        triplets.add(triplet);
                    }

                }
            }
        }
        return new ArrayList<>(triplets);
    }
}