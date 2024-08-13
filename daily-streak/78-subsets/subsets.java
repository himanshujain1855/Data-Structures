class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSets = new ArrayList();
        powerSet(subSets, nums, new ArrayList(), 0, nums.length);
        return subSets;
    }

    static void powerSet(List<List<Integer>> subSets,int[] nums,List<Integer> subset,int i,int len)
    {
       if(i==len){
            subSets.add(subset);
            return;
        }

        powerSet(subSets, nums, subset , i+1, len);
        List<Integer> subsetNew=new ArrayList<>(subset);
        subsetNew.add(nums[i]);
        powerSet(subSets, nums , subsetNew, i+1 , len);
    }
}