package gfg.maths;

public class Exactly3Divisors {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(10));
        System.out.println(exactly3Divisors(6));
        System.out.println(exactly3Divisors(2));
        System.out.println(exactly3Divisors(1));
        System.out.println(exactly3Divisors(3));
        System.out.println(exactly3Divisors(4));
        System.out.println(exactly3Divisors(67));
        System.out.println(exactly3Divisors(25));

        System.out.println("------------------");


        System.out.println(exactly3DivisorsA1(10));
        System.out.println(exactly3DivisorsA1(6));
        System.out.println(exactly3DivisorsA1(2));
        System.out.println(exactly3DivisorsA1(1));
        System.out.println(exactly3DivisorsA1(3));
        System.out.println(exactly3DivisorsA1(4));
        System.out.println(exactly3DivisorsA1(67));
        System.out.println(exactly3DivisorsA1(25));

        System.out.println("------------------");


        System.out.println(exactly3DivisorsA2(10));
        System.out.println(exactly3DivisorsA2(6));
        System.out.println(exactly3DivisorsA2(2));
        System.out.println(exactly3DivisorsA2(1));
        System.out.println(exactly3DivisorsA2(3));
        System.out.println(exactly3DivisorsA2(4));
        System.out.println(exactly3DivisorsA2(67));
        System.out.println(exactly3DivisorsA2(25));
    }

    public static int exactly3Divisors(int N) {
        int count = 0;

        for (int i = 4; i <=N; i++) {
            int tCount = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (tCount > 1) break;
                if (i % j == 0) {
                    tCount++;
                }
            }

            if (tCount == 1) {
                count++;
            }
        }
        return count;
    }

    public static int exactly3DivisorsA1(int N) {
        int[] numbers = new int[N+1];

        for (int i = 2; i <= N/2; i++)
                for (int j = i * 2; j <= N; j = i + j)
                    numbers[j] = numbers[j] + 1;


        int count = 0;

        for (int i = 1; i <= N; i++)
            if (numbers[i] == 1)
                count++;

        return count;

    }

    public static int exactly3DivisorsA2(int N) {
        int[] numbers = new int[N+1];

        for (int i = 2; i <= N/2; i++)
            for (int j = i * 2; j <= N; j = i + j)
                numbers[j] = numbers[j] + 1;


        int count = 0;

        for (int i = 4; i <= N; i++)
            if (numbers[i] == 1)
                count++;

        return count;

    }


    public int exactly3DivisorsA3(int N)
    {
        int count=0;

        for (int i = 2; i*i<=N ; i++) {
                if(isPrime(i)) count++;
        }

        return count;
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0 || n == 1) return false;
        int sqrtN = (int) Math.ceil(Math.sqrt(n));
        for (int i = 5; i <= sqrtN; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // we can also find using sieve of eratostheness

}
