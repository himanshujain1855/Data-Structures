class Solution {
    public int findTheWinner(int n, int k) {
        return findRealSurviver(n, k) + 1;
    }

    public int findRealSurviver(int n, int k) {
        if (n == 1)
            return 0;
        int adjustedSurviver = findRealSurviver(n - 1, k);
        int realSurviver = (adjustedSurviver + k) % n;
        return realSurviver;
    }

}