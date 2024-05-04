package gfg.bitwise;

public class FirstSetBit {
    public static void main(String[] args) {
        System.out.println(check(18));
        System.out.println(check(0));
        System.out.println(check(12));
    }

    public static int check(int n) {

        if (n == 0) return 0;
        int pos = 1;

        while (true) {
            if ((n & 1) == 1) break;
            pos = pos + 1;
            n = n >> 1;
        }
        return pos;

    }
}
