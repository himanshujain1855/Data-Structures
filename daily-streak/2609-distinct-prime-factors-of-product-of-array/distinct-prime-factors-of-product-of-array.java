class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFac = new HashSet();

        int len = nums.length;

        for (int i = 0; i < len; i++) {

            int n = nums[i];

            while (n > 0 && n % 2 == 0) {
                n = n / 2;
                primeFac.add(2);
            }

            while (n > 0 && n % 3 == 0) {
                n = n / 3;
                primeFac.add(3);
            }

            while (n > 0 && n % 5 == 0) {
                n = n / 5;
                primeFac.add(5);
            }

            for (int j = 7; j * j <= n; j += 6) {
                while (n > 0 && n % j == 0) {
                    n /= j;
                    primeFac.add(j);
                }

                while (n > 0 && n % (j + 4) == 0) {
                    n /= (j + 4);
                    primeFac.add(j + 4);
                }
            }

            if (n > 1)
                primeFac.add(n);

        }

        return primeFac.size();
    }
}