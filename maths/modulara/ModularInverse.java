package gfg.maths.modulara;

public class ModularInverse {
    public static void main(String[] args) {
        System.out.println(modInverse(2,6));
        System.out.println(modInverse(3,7));
        System.out.println(modInverse(3,11));
        System.out.println(modInverse(10,17));
    }

    public static int modInverse(int a, int m)
    {
        for(int i=0;i<m;i++){
            int abmodi= (int) MultiplicationUnderModulo.countLong(a,i,m);
            if(abmodi==1) return i;
        }
        return -1;
    }

}

