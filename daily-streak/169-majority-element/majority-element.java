class Solution {
    public int majorityElement(int[] nums) {
        int majorityElementMaxCount=-1;
        int majorityElement=0;

        int len=nums.length;
        
        HashMap<Integer,Integer> countMap=new HashMap();
        int tempCount;
        for(int i=0;i<len;i++){
            tempCount=countMap.getOrDefault(nums[i],0)+1;
            countMap.put(nums[i],tempCount);
            if(tempCount>majorityElementMaxCount){
                majorityElementMaxCount=tempCount;
                majorityElement=nums[i];
            }
        }

        return majorityElement;
    }
}