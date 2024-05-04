package gfg.maths.powers;

public class GPTerm {
    public static void main(String[] args) {
        System.out.println(termOfGP(2,3,1));
        System.out.println(termOfGP(1,2,5));
        System.out.println(termOfGP(2,4,5));
        System.out.println(termOfGP(2,4,10));
        System.out.println(termOfGP(84,87,3));
    }

    public static double termOfGP(int A,int B,int N)
    {
        double ratio=((double) B)/((double) A);
        double pow=calculatePowerOfDouble(ratio,N-1);
        return pow*A;
    }

    public static double calculatePowerOfDouble(double x, int m) {
        double res = 1;

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
