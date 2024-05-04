package gfg.maths;

public class TraillingZerosInFactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(count(10));
        System.out.println(countA1For(10));
        System.out.println(countA1While(10));

        System.out.println(count(25));
        System.out.println(countA1For(25));
        System.out.println(countA1While(25));

        System.out.println(count(125));
        System.out.println(countA1For(125));
        System.out.println(countA1While(125));
    }


    public static int count(int n) {
        long f = Factorial.facto(n);

        int count = 0;
        while (f > 0) {
            if (f % 10 == 0) count++;
            f = f / 10;
        }

        return count;
    }

    public static int countA1For(int n) {
        int count = 0;
        for (int i = 5; i <= n; i = i * 5) {
            count += n / i;
        }
        return count;
    }

    public static int countA1While(int n) {
        int count = 0;
        int i = 5;
        while (i <= n) {
            count += n / i;
            i *= 5;
        }
        return count;
    }
}
