class Solution {
    public int minBitFlips(int start, int goal) {
        if(start==goal) return 0;
        
        int count=0;
    
        while(true){
            if(goal==0 && start==0) return count;
            
            if((goal & 1)==1){
              if((start & 1)!=1) count++;   
            }else{
                if((start & 1)==1) count++;
            }
            
            start>>=1;
            goal>>=1;
        }
    }
}