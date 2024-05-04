package gfg.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -100, 3, 99};
        // reverse from 0 to size -1;
        reverse(arr,0,3);
        // reverse from 0 to k-1;
        reverse(arr,0,1);
        // reverse from  k+1 to size-1;
        reverse(arr,2,3);
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
