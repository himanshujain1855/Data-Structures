class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        if(len==1) return;
        int count=0;
        int start=0;

        while(start<len){
            if(nums[start]!=0){
                int temp=nums[start];
                nums[start]=0;
                nums[count]=temp;
                count++;
            }
            start++;
        }
    }
}