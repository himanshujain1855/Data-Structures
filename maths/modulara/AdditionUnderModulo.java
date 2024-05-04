package gfg.maths.modulara;

import org.w3c.dom.Node;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class AdditionUnderModulo {
    public static void main(String[] args) {
        System.out.println(sumUnderModulo(9223372036854775807L, 9223372036854775807L));
        System.out.println(sumUnderModulo(1000000008, 1000000008));
        System.out.println(sumUnderModulo(8279685334796349382L, 3890369874501826197L));

        System.out.println("------------");

        System.out.println(count(9223372036854775807L, 9223372036854775807L));
        System.out.println(count(1000000008, 1000000008));
        System.out.println(count(8279685334796349382L, 3890369874501826197L));

    }

    public static long sumUnderModulo(long a, long b) {
        BigInteger mod = new BigInteger(String.valueOf((long) Math.pow(10, 9) + 7));
        BigInteger bigIntegerA = new BigInteger(String.valueOf(a));
        BigInteger bigIntegerB = new BigInteger(String.valueOf(b));
        return Long.parseLong(bigIntegerA.add(bigIntegerB).mod(mod).toString());
    }

    public static long count(long a, long b) {
        return ((a % 1000000007) + (b % 1000000007)) % 1000000007;
    }

    public static long count(long a, long b, long m) {
        return ((a % m) + (b % m)) % m;
    }

}
