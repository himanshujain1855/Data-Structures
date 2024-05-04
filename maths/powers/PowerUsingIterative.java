package gfg.maths.powers;

public class PowerUsingIterative {
    public static void main(String[] args) {
        System.out.println(calculate(10, 3));

        System.out.println(calculate(3, 10));
    }

    public static long calculate(int x, int m) {
        long res = 1;

        while(m>0){
            if (m % 2 != 0) {
                res = res * x;
            }

            m = m / 2;
            x = x * x;
        }

        return res;
    }
}
