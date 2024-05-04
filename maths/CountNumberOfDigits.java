package gfg.maths;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(countA1(1234567));
    }

    public static int count(long n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static int countA1(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }
}
