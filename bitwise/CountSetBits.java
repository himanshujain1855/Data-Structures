package gfg.bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(count(5));
        System.out.println(count(7));
        System.out.println(count(13));
        System.out.println(count(4));

        System.out.println(countA1(5));
        System.out.println(countA1(7));
        System.out.println(countA1(13));
        System.out.println(countA1(4));
    }

    public static int count(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }

        return count;
    }

    public static int countA1(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
