class Solution {
    public int removeDuplicates(int[] nums) {
        int res=1;
        int len=nums.length;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[res-1]){
                nums[res++]=nums[i];
            }
        }

        return res;
    }
}