class Solution {
    public boolean isPerfectSquare(int num) {
        double sqrt=Math.sqrt((double)num);
        
        int sqrtInt=(int)sqrt;

        return sqrt == (double)sqrtInt;
    }
}