class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;

        int majElement=nums[0];
        int count=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=majElement){
                if(count==0){
                    majElement=nums[i];
                    count++;
                }else{
                    count--;
                }
            }else{
                count++;
            }
        }

        return majElement;
    }
}