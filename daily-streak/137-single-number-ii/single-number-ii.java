class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        
        if(len==1) return nums[0];

        Arrays.sort(nums);

        for(int i=1;i<len;i+=3){
            if(nums[i]!=nums[i-1] || nums[i]!=nums[i+1]){
                return nums[i-1];
            }
        }

        return nums[len-1];
    }
}