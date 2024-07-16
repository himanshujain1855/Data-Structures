class Solution {
    public int removeElement(int[] nums, int val) {
       int index=0;
       
       int len=nums.length;
       
       int count=0;

       while(index<len){
            if(nums[index]!=val){
                nums[count]=nums[index];
                count++;
            }
            index++;
       }

       return count;
    }
}