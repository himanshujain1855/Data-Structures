class Solution {
    public static int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFac = new HashSet();
        Set<Integer> numsSet = new HashSet();
        for (int num:nums){
            numsSet.add(num);
        }
        numsSet.forEach(integer -> {
            boolean nBy2 = false;
            boolean nBy3 = false;
            boolean nBy5 = false;

            while (integer % 2 == 0) {
                integer = integer / 2;
                nBy2 = true;
            }

            if (nBy2) {
                primeFac.add(2);
            }

            while (integer % 3 == 0) {
                integer = integer / 3;
                nBy3 = true;
            }

            if (nBy3) {
                primeFac.add(3);
            }

            while (integer % 5 == 0) {
                integer = integer / 5;
                nBy5 = true;
            }

            if (nBy5) {
                primeFac.add(5);
            }

            boolean nByj = false;

            boolean nByjPlus4 = false;

            for (int j = 7; j * j <= integer; j += 6) {
                while (integer % j == 0) {
                    integer /= j;
                    nByj = true;

                }

                if (nByj) {
                    primeFac.add(j);
                }

                while (integer % (j + 4) == 0) {
                    integer /= (j + 4);
                    nByjPlus4 = true;

                }

                if (nByjPlus4) {
                    primeFac.add(j + 4);
                }
            }

            if (integer > 1)
                primeFac.add(integer);

        });

        return primeFac.size();
    }
}