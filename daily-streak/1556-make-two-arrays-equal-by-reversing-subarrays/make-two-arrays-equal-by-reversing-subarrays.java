class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len=arr.length;
        int[] nums=new int[1001];

        for(int i=0;i<len;i++){
            nums[target[i]]++;
        }

        for(int i=0;i<len;i++){
            if(nums[arr[i]]==0) return false;
            nums[arr[i]]--;
        }

        return true;
    }
}