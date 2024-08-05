class Solution {
    public String kthDistinct(String[] arr, int k) {
        int len=arr.length;

        HashMap<String,Integer> freqMap=new HashMap();

        for(int i=0;i<len;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }

        int count=0;
        
        String firstStr="";

        for(int i=0;i<len;i++){
            if(freqMap.getOrDefault(arr[i],0)==1){
                count++;
                if(count==k) return arr[i];
            }
        }
        return "";
    }
}