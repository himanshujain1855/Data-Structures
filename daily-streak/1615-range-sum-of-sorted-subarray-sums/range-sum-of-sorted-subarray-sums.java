class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subArrList = new ArrayList();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subArrList.add(sum);
            }
        }
        int size=subArrList.size();
        if(!(size==right && left==1)) Collections.sort(subArrList);
        int ans = 0;
        int mod = 1000000007;
        for (int i = left; i <= right; i++) {
            ans += (subArrList.get(i - 1) % mod);
            ans = ans % mod;
        }
        return (int)(ans % mod);
    }
}