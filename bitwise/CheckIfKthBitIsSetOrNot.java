package gfg.bitwise;

public class CheckIfKthBitIsSetOrNot {
    public static void main(String[] args) {
//        System.out.println(check(5, 1));
//        System.out.println();
//        System.out.println(check(8, 2));
//        System.out.println();
//        System.out.println(check(0, 3));
        System.out.println(check(39, 5));
        System.out.println(check(500, 5));
    }

    // Starting index is 0
    public static boolean check(int n, int k) {

        if (n == 0) return false;
        int t = 1;

        t = t << (k);

        return (n & t) == t;
    }

    public static boolean checkA1(int n, int k) {
        return (n & (1 << k)) == 0;
    }
}
