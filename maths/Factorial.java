package gfg.maths;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factoA1(10));
        System.out.println(factoA1(20));
        System.out.println(factoA1(25));

        System.out.println("************");

        System.out.println(factoA2(10));
        System.out.println(factoA2(20));
        System.out.println(factoA2(25));
    }

    // space complexity big(n)
    // time complexity big(n)
    public static long factoRecursive(int n) {
        if (n == 0) return 1;
        return n * factoRecursive(n - 1);
    }

    // space complexity big(1)
    // time complexity theta(n)
    // preferred solution because recursive solution is taking extra space hence
    public static long facto(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


    // space complexity big(1)
    // time complexity theta(n)
    // preferred solution because recursive solution is taking extra space hence and it supports larger value
    public static BigInteger factoA1(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            f = f.multiply(new BigInteger(String.valueOf(i)));
        }
        return f;
    }

    // space complexity big(1)
    // time complexity theta(n)
    // preferred solution because recursive solution is taking extra space hence and it supports larger value
    public static String factoA2(int n) {
        double logF = Math.log(1);

        for (int i = 2; i <= n; i++) {
            logF += Math.log(i);
        }

        // here we have log(n!)
        // to find n! let's use another log prop....

        BigDecimal result = new BigDecimal(Math.exp(logF));
        return result.toString();
    }
}
