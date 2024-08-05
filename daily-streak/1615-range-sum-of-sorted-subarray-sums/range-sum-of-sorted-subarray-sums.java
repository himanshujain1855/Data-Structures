class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int cap = (int) (n * (((double) n + 1) / 2));
        ArrayList<Integer> subArrList = new ArrayList<>(cap);

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subArrList.add(sum);
            }
        }
        if (!(cap == right && left == 1))
            Collections.sort(subArrList);
        long ans = 0;

        for (int i = left; i <= right; i++) {
            ans += (subArrList.get(i - 1) % mod);
        }
        return (int) (ans % mod);
    }
}