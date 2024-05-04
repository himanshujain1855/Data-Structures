package gfg.maths;

import java.math.BigInteger;

public class CountDigitsInFactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("*************A1");
        System.out.println(countA1(1));
        System.out.println(countA1(5));
        System.out.println(countA1(10));
        System.out.println(countA1(15));
        System.out.println(countA1(20));
        System.out.println(countA1(42));

        System.out.println("*************A2");
        System.out.println(countA2(1));
        System.out.println(countA2(5));
        System.out.println(countA2(10));
        System.out.println(countA2(15));
        System.out.println(countA2(20));
        System.out.println(countA2(42));
        System.out.println(countA2(100000));

        System.out.println("*************A3");
        System.out.println(countA3(1));
        System.out.println(countA3(5));
        System.out.println(countA3(10));
        System.out.println(countA3(15));
        System.out.println(countA3(20));
        System.out.println(countA3(42));
        System.out.println(countA3(100000));
    }


    public static int countA1(int n){
        long f=Factorial.facto(n);
        return CountNumberOfDigits.countA1(f);
    }


    public static int countA2(int n){
        BigInteger f =Factorial.factoA1(n);
        return f.toString().length();
    }

    public static int countA3(int n){
        double count=0;

        for(int i=1;i<=n;i++){
            count+=Math.log10(i);
        }

        return (int)(1+Math.floor(count));
    }
}
