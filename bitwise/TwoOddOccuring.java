package gfg.bitwise;

public class TwoOddOccuring {
    public static void main(String[] args) {
        print(new int[]{3,4,3,4,5,4,4,6,7,7});
        System.out.println();
        print(new int[]{1,3,2,3,3,1});
    }

    public static void print(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            int count=0;

            for (int num : nums) {
                if (nums[i] == num) count++;
            }

            if((count & 1)==1) System.out.print(nums[i]);
        }
    }
}
