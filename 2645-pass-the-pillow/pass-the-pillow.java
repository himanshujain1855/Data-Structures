class Solution {
    public int passThePillow(int n, int time) {
        if(time < n) return 1 + time; 
        
        if ((time % (n-1)) == 0){
            return ((time / (n-1)) % 2) == 0 ? 1 : n;
        }

        int ans = 1;

        boolean increase = true;

        for (int i = 1; i <= time; i++) {
            if (time <= 0)
                return ans;

            if (ans == n) {
                increase = false;
            }

            if (ans == 1) {
                increase = true;
            }

            if (increase)
                ans++;
            else
                ans--;
        }

        return ans;
    }
}