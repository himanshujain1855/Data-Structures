package gfg.bitwise;

public class OneOddOccuring {
    public static void main(String[] args) {
        System.out.println(calculate(new int[]{4,3,4,4,4,5,5}));

        System.out.println(calculate(new int[]{8,7,7,8,8}));


        System.out.println("----------------V1---------------");


        System.out.println(calculateVOne(new int[]{4,3,4,4,4,5,5}));

        System.out.println(calculateVOne(new int[]{8,7,7,8,8}));
    }

    public static int calculate(int[] nums){
        for (int k : nums) {
            int count = 0;

            for (int i : nums) {
                if (k == i) count++;
            }

            if ((count & 1) == 1) {
                return k;
            }
        }
        return -1;
    }


    public static int calculateVOne(int[] nums){
        int num=0;

        for (int j : nums) {
            num ^= j;
        }

        return num;
    }

}
