class Solution {
    public int valueAfterKSeconds(int n, int k) {
        if (n == 1)
            return 1;

        if (n==2)
            return k+1;
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 1;
        }

        int prefSum=0;

        for(int i=0;i<k;i++){
            for(int j=1;j<n;j++){
                arr[j]=(arr[j] % 1000000007 + arr[j-1] % 1000000007) % 1000000007;
            }
        }

        return arr[n-1];
    }
}