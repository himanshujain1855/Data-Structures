class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefSumMap = new HashMap();
        prefSumMap.put(0, 1);

        int len = nums.length;

        int prefSum = 0;

        int ans = 0;

        for (int i = 0; i < len; i++) {
            prefSum += nums[i];

            if (prefSumMap.containsKey(prefSum - k)) {
                ans += prefSumMap.get(prefSum - k);
            }

            prefSumMap.put(prefSum, prefSumMap.getOrDefault(prefSum, 0) + 1);
        }

        return ans;
    }
}