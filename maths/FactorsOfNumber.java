package gfg.maths;

public class FactorsOfNumber {
    public static void main(String[] args) {
        printFactors(7);
        System.out.println("-------------");
        printFactors(100);
        System.out.println("-------------");
        printFactors(15);
        System.out.println("-------------");


        System.out.println("-----------------");


        printFactorsA1(7);
        System.out.println("-------------");
        printFactorsA1(100);
        System.out.println("-------------");
        printFactorsA1(15);
        System.out.println("-------------");

        System.out.println("-------------------------------");


        printFactorsA1Sorted(7);
        System.out.println("-------------");
        printFactorsA1Sorted(100);
        System.out.println("-------------");
        printFactorsA1Sorted(15);
        System.out.println("-------------");


        printPrimeFactorsRecursive(7);

        System.out.println("-------------");

        printPrimeFactorsRecursive(100);

        System.out.println("-------------");

        printFactorsA1Sorted(15);

        System.out.println("-------------");

        printFactorsA1Sorted(182);

        System.out.println("-------------");

        printFactorsA1Sorted(176);
    }


    public static void printFactors(int num) {
        System.out.println(1);
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(num);
    }

    public static void printFactorsA1(int num) {
        System.out.println(1);
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                if ((num / i) != i) {
                    System.out.println((num / i));
                }
            }
        }
        System.out.println(num);
    }

    public static void printFactorsA1Sorted(int num) {
        System.out.println(1);
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        for (int i = (int) Math.sqrt(num); i >= 2; i--) {
            if (num % i == 0 && (num / i) != i) {
                System.out.println(num / i);
            }
        }
        System.out.println(num);
    }

    public static void printPrimeFactorsRecursive(int num){
        System.out.println(1);
        printPrimeFactorsRecursive(num,2);
        System.out.println(num);
    }
    public static void printPrimeFactorsRecursive(int num, int i){
        if((i*i) > num) return;

        if(num%i ==0) System.out.println(i);

        printPrimeFactorsRecursive(num,i+1);

        if(num%i ==0 && (num / i) != i ){
            System.out.println(num/i);
        }
    }
}
