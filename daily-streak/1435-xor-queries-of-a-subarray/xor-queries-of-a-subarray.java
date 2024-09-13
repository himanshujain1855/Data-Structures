class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int queriesLen=queries.length;
        int n=arr.length;

        int[] answers=new int[queriesLen];

        for(int i=0;i<queriesLen;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            
            int ans=0;

            if(start==end) ans=arr[start];
            else if(end-start==1) ans= arr[start] ^ arr[end];
            else{
                for(int j=start;j<=end;j++){
                    ans^=arr[j];
                }
            }

            answers[i]=ans;
        }

        return answers;
    }
}