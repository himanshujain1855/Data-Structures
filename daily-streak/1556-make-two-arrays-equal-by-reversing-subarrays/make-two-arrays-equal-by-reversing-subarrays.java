class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> targetMap=new HashMap();
        int len=arr.length;

        for(int i=0;i<len;i++){
            targetMap.put(target[i],targetMap.getOrDefault(target[i],0)+1);
        }

        for(int i=0;i<len;i++){
            if(!targetMap.containsKey(arr[i])) return false;
            if(targetMap.get(arr[i])==0) return false;
            targetMap.put(arr[i],targetMap.get(arr[i])-1);
        }

        return true;
    }
}