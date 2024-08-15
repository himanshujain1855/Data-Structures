class Solution {
    public int findTheWinner(int n, int k) {
        int currSurviverPos=0;

        int i=1;

        while(i<n){
            currSurviverPos = (currSurviverPos + k) % (++i);
        }

        return currSurviverPos+1;
    }
}