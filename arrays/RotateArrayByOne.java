package gfg.arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        rotate(arr);
        System.out.println("done");
    }

    public static void rotate(int[] nums){
        int temp=nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];
        }

        nums[nums.length-1]=temp;
    }

    public static void rotateRight(int[] nums) {
        int temp = nums[nums.length - 1];

        for (int i = (nums.length - 1); i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
