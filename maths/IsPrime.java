package gfg.maths;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(checkA1(25));
    }


    public static boolean check(int n) {
        if (n == 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean checkA1(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0 || n == 1) return false;
        int sqrtN = (int) Math.ceil(Math.sqrt(n));
        for (int i = 5; i <= sqrtN; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
