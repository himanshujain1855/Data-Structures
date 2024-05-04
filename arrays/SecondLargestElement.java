package gfg.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findIndex(new int[]{10, 5, 8, 20}));
        System.out.println(findIndex(new int[]{10, 10, 10}));
        System.out.println(findIndex(new int[]{20, 10, 20, 8, 17}));

        System.out.println(findElement(new int[]{1, 2, 3, 4, 5}));
        System.out.println(findElement(new int[]{10, 5, 8, 20}));
        System.out.println(findElement(new int[]{10, 10, 10}));
        System.out.println(findElement(new int[]{20, 10, 20, 8, 17}));

    }

    public static int findIndex(int arr[]) {
        int lI = -1;
        int sI = lI;
        int lE = Integer.MIN_VALUE;
        int sE = lE;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] > lE) {
                sI = lI;
                sE = lE;
                lE = arr[i];
                lI = i;
            } else if (arr[i] > sE && arr[i] != lE) {
                sE = arr[i];
                sI = i;
            }
        }
        return sI;
    }

    public static int findElement(int arr[]) {
        int lE = Integer.MIN_VALUE;
        int sE = lE;

        for (int j : arr) {
            if (j > lE) {
                sE = lE;
                lE = j;
            } else if (j > sE && j != lE) {
                sE = j;
            }
        }
        return sE==Integer.MIN_VALUE ? -1 : sE;
    }

}
