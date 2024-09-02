class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq[]=new int[1001];
        
        int nums1Freq[]=freq(nums1);
        int nums2Freq[]=freq(nums2);

        for(int i=0;i<1001;i++){
            freq[i]=Math.min(nums1Freq[i],nums2Freq[i]);
        }

        List<Integer> ans=new ArrayList();

        for(int i=0;i<1001;i++){
            if(freq[i]>0){
                for(int j=0;j<freq[i];j++){
                   ans.add(i); 
                }
            }
        }

        int[] finalAns=new int[ans.size()];

        for(int i=0;i<finalAns.length;i++){
           finalAns[i]= ans.get(i);
        }

        return finalAns;
    }


    public static int[] freq(int[] nums) {
        int freq[]=new int[1001];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            freq[nums[i]]++;
        }

        return freq;
    }
}