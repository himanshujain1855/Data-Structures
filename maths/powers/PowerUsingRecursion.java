package gfg.maths.powers;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        System.out.println(calculate(10,3));

        System.out.println(calculate(3,10));
    }

    public static long calculate(int x, int m){
        if(m==0) return 1;
        long pow=calculate(x,m/2);
        pow=pow*pow;
        if(m%2==0) return pow;
        else return x*pow;
    }
}
