package gfg.arrays;

import java.util.ArrayList;

import static gfg.arrays.RotateArrayByOne.rotateRight;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateByKTwo(arr, 3);
        System.out.println("yes");
        arr = new int[]{1, 2};
        rotateByKTwo(arr, 2);
        System.out.println("yes");
        arr = new int[]{1};
        rotateByKTwo(arr, 1);
        System.out.println("yes");
        arr = new int[]{-1, -100, 3, 99};
        rotateByKTwo(arr, 2);
        System.out.println("yes");
        arr = new int[]{-1, -100, 3, 99};
        rotateByKTwo(arr, 3);
        System.out.println("yes");
    }

    public static void rotateByK(int[] arr, int k) {
        for (int i = 1; i <= k; i++) {
            rotateRight(arr);
        }
    }

    public static void rotateByKOne(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        if (k == 0) return;
        if (size % 2 == 0 && k % 2 == 0) {
            int temp;
            for (int i = 0; i < k; i++) {
                temp=nums[i+2];
                nums[i+2]=nums[i];
                nums[i]=temp;
            }
        } else {
            int set = 0;
            int i = k;
            int t1, t2;
            t1 = nums[0];

            while (set < nums.length) {
                t2 = nums[i];
                nums[i] = t1;
                set++;
                i = (i + k) % nums.length;
                t1 = t2;
            }
        }

    }

    public static void rotateByKTwo(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        if (k == 0) return;
        reverse(nums,0,size-1);
        reverse(nums,0,k-1);
        reverse(nums,k,size-1);
    }
    public static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }


}
