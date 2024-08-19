class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        
        int maxDiff=0;
        
        int min=prices[0];

        for(int i=1;i<len;i++){
            int curr=prices[i];
            
            if(curr > min){
                if(curr-min > maxDiff){
                    maxDiff = curr-min;
                }
            }else{
                min=curr;
            }
        }

        return maxDiff;
    }
}