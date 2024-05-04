package gfg.maths.powers;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println(calculate(10,3));

        System.out.println(calculate(3,10));
    }

    // TC o(m) not an efficient
    public static long calculate(int x,int m){
        long res=1;
        for(int i=1;i<=m;i++){
            res*=x;
        }
        return res;
    }
}
