package gfg.maths;

public class PrimeFactors {
    public static void main(String[] args) {
        //        printPrimeFactorsA1(84);
//
//        System.out.println("-------");
//
//        printPrimeFactorsA1(450);
//
//        System.out.println("-------");
//
//        printPrimeFactorsA1(13);
//
//        System.out.println("-------");
//
//
//        printPrimeFactorsA1(30);
//
//        System.out.println("-------");
//
//        printPrimeFactorsA1(12);
//
//        System.out.println("-----------------------------");
//
//        printPrimeFactorsA2(84);
//
//        System.out.println("-------");
//
//        printPrimeFactorsA2(450);
//
//        System.out.println("-------");
//
//        printPrimeFactorsA2(13);
//
//        System.out.println("-------");


        printPrimeFactorsA1(30);
        System.out.println("-----------------------");

        printPrimeFactorsA2(30);

        System.out.println("-------");

//        printPrimeFactorsA2(12);
//
//        System.out.println("-------");


    }

    // TC big n*sqrt(n)
    public static void printPrimeFactors(int num) {
        int primeFactor = 2;

        while (num > 1) {
            if (IsPrime.checkA1(primeFactor)) {
                if (num % primeFactor == 0) {
                    System.out.println(primeFactor);
                    num /= primeFactor;
                } else {
                    primeFactor++;
                }
            } else {
                primeFactor++;
            }
        }
    }

    // TC big n*sqrt(n)
    public static void printPrimeFactorsA1(int num) {
        int primeFactor = 2;

        while (num > 1) {
            if (num % primeFactor == 0) {
                System.out.println(primeFactor);
                num /= primeFactor;
            } else {
                primeFactor++;
            }
        }
    }

    public static void printPrimeFactorsA2(int num) {

        for (int i = 2; i*i <=num ; i++) {
            while (num%i==0) {
                System.out.println(i);
                num /= i;
            }
        }

        if(num>1) System.out.println(num);
    }
}
