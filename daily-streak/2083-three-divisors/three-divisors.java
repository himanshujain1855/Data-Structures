class Solution {
    public boolean isThree(int n) {
       int tCount=0;
       
       for(int i=2;i*i<=n;i++){
            if(n%i==0){
                tCount++;
                if(i != (n/i)) tCount++;
            }  
            if(tCount>1) break;
       } 

       return tCount==1;
    }
}