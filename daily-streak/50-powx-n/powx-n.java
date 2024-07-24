class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        int absN=Math.abs(n);

        double pow=calculatePow(x,absN);

        if(n < 0) return (1 / pow);
        else return pow;
    }

    public static double calculatePow(double x, int n){
        if(n==0) return 1;

        double pow=calculatePow(x,n/2);

        pow=pow* pow;
        if(n%2==0) return pow;
        else return x * pow;
    }
}