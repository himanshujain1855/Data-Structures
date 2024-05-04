package gfg.maths;

public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(3, 6));
        System.out.println(gcd(1, 1));
        System.out.println(gcd(12, 14));

        System.out.println("----------------------");

        System.out.println(gcdA1(3, 6));
        System.out.println(gcdA1(1, 1));
        System.out.println(gcdA1(12, 14));

        System.out.println("----------------------");

        System.out.println(gcdA2Recursive(3, 6));
        System.out.println(gcdA2Recursive(1, 1));
        System.out.println(gcdA2Recursive(12, 14));

        System.out.println(gcdA2Recursive(43, 91));


    }


    // GFG not accepted
    // TC big(min(A,B))
    public static int gcd(int A, int B) {
        int gcd = Math.min(A, B);

        while (gcd >= 1) {
            if (A % gcd == 0 && B % gcd == 0) break;
            gcd--;
        }
        return gcd;
    }

    // GFG accepted
    // LC accepted
    // TC big(min(A,B))
    public static int gcdA1(int a, int b) {
        int t = b;

        if (a < b) {
            b = a;
            a = t;
        }

        while (b > 0) {
            t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // GFG accepted
    // TC big(min(A,B))
    public static int gcdA2(int a, int b) {
        int t = b;

        if (a < b) {
            b = a;
            a = t;
        }

        while (b > 0) {
            t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // GFG accepted
    // TC Worst big(min(A,B))
    // TC Worst big(log(min(A,B)))
    public static int gcdA2Recursive(int a, int b) {
        if (b == 0) return a;
        return gcdA2Recursive(b, a % b);
    }
}
