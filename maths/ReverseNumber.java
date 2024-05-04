package gfg.maths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumberA2(121));
        System.out.println(reverseNumberA2(-121));
        System.out.println(reverseNumberA2(-123));
        System.out.println(reverseNumberA2(123));
        System.out.println(reverseNumberA2(-1111111112));
        System.out.println(reverseNumberA2(1534236469));

    }

    // Negative number not supported
    public static int reverseNumber(int n) {
        int copyN = n < 0 ? -n : n;
        int revN = 0;

        while (copyN > 0) {
            revN = revN * 10 + copyN % 10;
            copyN /= 10;
        }
        return revN;
    }

    // Negative number  supported
    public static int reverseNumberA1(int n) {
        int copyN = n < 0 ? -n : n;
        int revN = 0;

        while (copyN > 0) {
            revN = revN * 10 + copyN % 10;
            copyN /= 10;
        }
        return n < 0 ? -revN : revN;
    }

    // Added check for int range exceeds
    public static int reverseNumberA2(int n) {
        int copyN = n < 0 ? -n : n;
        long revN = 0;

        while (copyN > 0) {
            revN = revN * 10 + copyN % 10;
            copyN /= 10;
        }

        if (revN > Integer.MAX_VALUE || revN < Integer.MIN_VALUE) return 0;
        return n < 0 ? (int) -revN : (int) revN;
    }
}
