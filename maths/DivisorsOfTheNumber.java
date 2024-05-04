package gfg.maths;

public class DivisorsOfTheNumber {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            System.out.println(i+":       "+calculate(i));
        }
    }

    public static int calculate(int num){
        int count=2;

        for (int i = 2; i<=num/2 ; i++) {

            if (count>3) break;

            if(num%i==0){
                count++;
            }
        }

        return count;
    }

    public static void printDivisorsTillN(int n){

    }
}
