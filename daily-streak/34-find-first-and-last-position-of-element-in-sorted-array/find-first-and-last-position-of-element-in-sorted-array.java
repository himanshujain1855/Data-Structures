class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        int n=nums.length;
        if(n==0) return ans;
        if(n==1){
            if(nums[0]==target) return new int[]{0,0};
            else return ans;
        } 

        int start=0;
        int end=n-1;
        int mid; 
        int targetFoundIndex=-1;

        while(start <= end){
            mid = (start + end) / 2;
            
            if(nums[mid] == target){
                targetFoundIndex=mid;
                break;
            }else if(nums[mid] > target){
                end=mid-1;
            }else {
                start=mid+1;
            }
        } 
        
        
        if(targetFoundIndex==-1) return ans;

        start=targetFoundIndex;

        while(start>0 && nums[start-1]==target){
            start--;
        }
        
        end=start;

        while(end < n-1){
            if(nums[end+1]==target) end++;
            else break;
        }
        return new int[]{start,end};
    }
}