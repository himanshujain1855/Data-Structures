class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        
        int l=0;
        
        int r=n-1;
        
        int mid;

        while(l < r){
            
            mid=(l+r)/2;

            if(nums[mid] > nums[r]){
                l=mid+1;
            }else {
                r=mid;
            }
        }

        return nums[l];
    }
}