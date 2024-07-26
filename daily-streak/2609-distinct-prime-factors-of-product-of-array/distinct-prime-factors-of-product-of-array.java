class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFac = new HashSet();

        int len = nums.length;

        for (int i = 0; i < len; i++) {

            int n = nums[i];

            boolean nBy2 = false;
            boolean nBy3 = false;
            boolean nBy5 = false;

            while (n % 2 == 0) {
                n = n / 2;
                nBy2 = true;
            }

            if (nBy2) {
                primeFac.add(2);
            }

            while (n % 3 == 0) {
                n = n / 3;
                nBy3 = true;
            }

            if (nBy3) {
                primeFac.add(3);
            }

            while (n % 5 == 0) {
                n = n / 5;
                nBy5 = true;
            }

            if (nBy5) {
                primeFac.add(5);
            }

            boolean nByj = false;

            boolean nByjPlus4 = false;

            for (int j = 7; j * j <= n; j += 6) {
                while (n % j == 0) {
                    n /= j;
                    nByj = true;

                }

                if (nByj) {
                    primeFac.add(j);
                }

                while (n % (j + 4) == 0) {
                    n /= (j + 4);
                    nByjPlus4 = true;

                }

                if (nByjPlus4) {
                    primeFac.add(j + 4);
                }
            }

            if (n > 1)
                primeFac.add(n);

        }

        return primeFac.size();
    }
}