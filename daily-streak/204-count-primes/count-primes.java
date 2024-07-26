class Solution {
    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!sieve[i]) {

                int j = i * i;

                while (j <= n) {
                    sieve[j] = true;
                    j = j + i;
                }
            }
        }

        int count=0;
        for (int i = 2; i < n; i++) {
            if (!sieve[i]) count++;
        }

        return count;

    }
}