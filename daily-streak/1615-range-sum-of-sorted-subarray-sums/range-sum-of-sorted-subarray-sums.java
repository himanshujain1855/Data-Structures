class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        List<Integer> subArrList = new ArrayList();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += (nums[j] % mod);
                subArrList.add(sum % mod);
            }
        }
        int size=subArrList.size();
        if(!(size==right && left==1)) Collections.sort(subArrList);
        long ans = 0;

        for (int i = left; i <= right; i++) {
            ans += (subArrList.get(i - 1) % mod);
        }
        return (int)(ans % mod);
    }
}