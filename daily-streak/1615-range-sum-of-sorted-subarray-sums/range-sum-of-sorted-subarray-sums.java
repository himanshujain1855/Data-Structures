class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int cap = (int) (n * (((double)n + 1) / 2));
        int[] arr = new int[cap];
        int index=0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                arr[index]=sum;
                index++;
            }
        }
        if (!(cap == right && left == 1)){
            Arrays.sort(arr);
        }
        long ans = 0;
        left--;

        for (int i = left; i < right; i++) {
            ans += (arr[i] % mod);
        }
        return (int) (ans % mod);
    }
}