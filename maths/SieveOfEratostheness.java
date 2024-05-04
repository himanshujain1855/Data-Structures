package gfg.maths;

import java.util.Arrays;

public class SieveOfEratostheness {
    public static void main(String[] args) {
//        System.out.println(countPrimeNumberTillN(10000));
//        System.out.println(countPrimeNumberTillN(2));
//
//        System.out.println("-------------------");
//
//        System.out.println(countPrimeNumberUptoN(10000));
//        System.out.println(countPrimeNumberUptoN(2));
//
//        System.out.println("-------------------");
//
//        System.out.println(countPrimeNumberUptoNA2(10000));
//        System.out.println(countPrimeNumberUptoNA2(2));
//
//        System.out.println("-------------------");
//
//        System.out.println(countPrimeNumberUptoNA3(10000));
//        System.out.println(countPrimeNumberUptoNA3(2));
//
//        System.out.println("-------------------");

        System.out.println(countPrimeNumberUptoNA4(100));
        System.out.println(countPrimeNumberUptoNA4(10000));
        System.out.println(countPrimeNumberUptoNA4(2));
        System.out.println(countPrimeNumberUptoNA4(1));


        System.out.println("-------------------------------------- countPrimeNumbersTillN");

        System.out.println(countPrimeNumbersTillN(100));
        System.out.println(countPrimeNumbersTillN(10000));
        System.out.println(countPrimeNumbersTillN(2));
        System.out.println(countPrimeNumbersTillN(1));


        System.out.println("-------------------------------------- countPrimeNumbersTillNA1");

        System.out.println(countPrimeNumbersTillNA1(100));
        System.out.println(countPrimeNumbersTillNA1(10000));
        System.out.println(countPrimeNumbersTillNA1(2));
        System.out.println(countPrimeNumbersTillNA1(1));
    }

    public static void printPrimeNumber(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            primeNumber[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primeNumber[i]) {
                for (int j = i + i; j <= n; j += i) {
                    primeNumber[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static int countPrimeNumberTillN(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            primeNumber[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primeNumber[i]) {
                for (int j = i + i; j <= n; j += i) {
                    primeNumber[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumberUptoN(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            primeNumber[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (primeNumber[i]) {
                for (int j = i + i; j < n; j += i) {
                    primeNumber[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumberUptoNA1(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        for (int i = 2; i * i < n; i++) {
            if (!primeNumber[i]) {
                for (int j = i + i; j < n; j += i) {
                    primeNumber[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumberUptoNA2(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        for (int i = 2; i * i < n; i++) {
            if (!primeNumber[i]) {
                for (int j = i * i; j < n; j += i) {
                    primeNumber[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumberUptoNA3(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        if (n > 3) {
            for (int j = 4; j < n; j += 2) {
                primeNumber[j] = true;
            }
        }

        for (int i = 2; i * i < n; i++) {
            if (!primeNumber[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    primeNumber[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumberUptoNA4(int n) {
        boolean[] primeNumber = new boolean[n + 1];

        if (n > 3) {
            for (int j = 4; j < n; j += 2) {
                primeNumber[j] = true;
            }
        }

        for (int i = 3; i * i < n; i++) {
            if (!primeNumber[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    primeNumber[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!primeNumber[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countPrimeNumbersTillN(int n) {
        boolean[] primerNumbers = new boolean[n + 1];
        Arrays.fill(primerNumbers,true);

        int count=0;

        for (int i = 2; i <n ; i++) {
            if(primerNumbers[i]){
                for (int j = i*i; j <n ; j=j+i) primerNumbers[j]=false;
            }
        }

        for (int i = 2; i <n ; i++) {
            if(primerNumbers[i]){
                count++;
            }
        }

        return count;

    }

    public static int countPrimeNumbersTillNA1(int n) {
        boolean[] primerNumbers = new boolean[n + 1];
        Arrays.fill(primerNumbers,true);

        int count=0;

        for (int i = 2; i <n ; i++) {
            if(primerNumbers[i]){
                count++;
                for (int j = i*i; j <n ; j=j+i) primerNumbers[j]=false;
            }
        }

        return count;

    }

}