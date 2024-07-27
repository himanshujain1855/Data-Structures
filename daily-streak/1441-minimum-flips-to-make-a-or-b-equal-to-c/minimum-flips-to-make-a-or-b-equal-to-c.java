class Solution {
    public int minFlips(int a, int b, int c) {
        int aOrB=a | b;
        
        int count=0;

        while(true){
            if(aOrB==0 && c==0) return count;

            if((c & 1)==1){
                if((aOrB & 1)!=1) count++;
            }else{
                if((a & 1)==1) count++;
                if((b & 1)==1) count++;
            }

            aOrB>>=1;
            a>>=1;
            b>>=1;
            c>>=1;
        }
    }
}