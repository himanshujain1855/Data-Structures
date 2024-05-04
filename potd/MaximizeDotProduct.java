package gfg.potd;

public class MaximizeDotProduct {
    public static void main(String[] args) {
//        System.out.println(maxDotProduct(5, 3, new int[]{2, 3, 1, 7, 8}, new int[]{3, 6, 7}));
//        System.out.println(maxDotProduct(3, 1, new int[]{1, 2, 3}, new int[]{4}));
//        System.out.println(maxDotProduct(3, 3, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(maxDotProduct(10, 8, new int[]{2, 7 ,2 ,4 ,3 ,6 ,10, 2, 8, 8}, new int[]{6, 10 ,3 ,6 ,4 ,1 ,8 ,1}));
    }

    public static int maxDotProduct(int n, int m, int a[], int b[]) {

        int[] newB = new int[n];

        int countOfItemsForZeroReplace = n - m;

        if (countOfItemsForZeroReplace == 0) return mul(n, a, b);

        int pos = 0;

        int min = 2000;

        for (int i = 0; i < countOfItemsForZeroReplace; i++) {
            for (int j = 0; j < n; j++) {
                if (newB[j] != -1 && min >= a[j]) {
                    min = a[j];
                    pos = j;
                }
            }
            min = 2000;
            newB[pos] = -1;
            pos = 0;
        }


        for (int i = 0; i < n; i++) {
            if (newB[i] == -1) continue;
            newB[i] = b[pos];
            pos++;
        }

        return mul(n, a, newB);
    }

    public static int mul(int n, int a[], int b[]) {
        int mul = 0;

        for (int i = 0; i < n; i++) {
            if (b[i] == -1) continue;
            mul = mul + (a[i] * b[i]);

        }

        return mul;
    }
}
