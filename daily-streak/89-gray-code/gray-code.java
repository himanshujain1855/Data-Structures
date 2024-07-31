class Solution {
    public List<Integer> grayCode(int n) {
        int ansSize=(1 << (n));
        
        List<Integer> ans=new ArrayList();
        
        for(int i=0;i<ansSize;i++){
            int grayEq = (i ^ (i >> 1));
            ans.add(grayEq);
        }

        return ans;
    }
}