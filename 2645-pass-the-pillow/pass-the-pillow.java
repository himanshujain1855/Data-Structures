class Solution {
    public int passThePillow(int n, int time) {
        if(time < n) return 1 + time; 
        
        

        if((time / (n-1)) % 2==0){
            return 1 + (time % (n-1));
        }else {
            return n - (time % (n-1));
        }
    }
}