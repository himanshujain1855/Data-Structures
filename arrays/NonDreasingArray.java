package gfg.arrays;

public class NonDreasingArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1}; // false
        System.out.println(checkPossibility(arr));
        arr = new int[]{4, 2, 3}; // true
        System.out.println(checkPossibility(arr));
        arr = new int[]{1, 2, 3, 4}; // true
        System.out.println(checkPossibility(arr));
        arr = new int[]{4, 1, 2, 3}; // true
        System.out.println(checkPossibility(arr));
        arr = new int[]{4, 1, 3, 2}; // false
        System.out.println(checkPossibility(arr));
        arr = new int[]{3, 4, 2, 3}; // false
        System.out.println(checkPossibility(arr));
        arr = new int[]{-1, 4, 2, 3}; // true
        System.out.println(checkPossibility(arr));
    }

    public static boolean checkPossibility(int[] nums) {
        int mCount = 0;

        boolean possible = true;
        int i = 1;

        while (i < nums.length) {

            if (nums[i] < nums[i - 1]) {

                mCount++;

                if (mCount > 1) {
                    possible = false;
                    break;
                }

                if (i > 1 && i < nums.length - 1) {
                    nums[i] = nums[i - 1] + 1;
                }
            }
            i++;
        }
        return possible;
    }
}
