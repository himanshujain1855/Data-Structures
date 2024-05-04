package gfg.maths.modulara;

public class MultiplicationUnderModulo {
    public static void main(String[] args) {

    }

    public static int count(int a,int b,int m){
        return ((a%m) * (b %m)) % m;
    }


    public static long count(long a, long b) {
        return ((a % 1000000007) * (b % 1000000007)) % 1000000007;
    }

    public static long countLong(long a, long b, long c)
    {
        return ((a % c) * (b % c)) % c;

    }
}
