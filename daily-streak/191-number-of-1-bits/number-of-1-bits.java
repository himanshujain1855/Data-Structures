class Solution {
    static int[] setBitsZeroTo255 = new int[256];

    static {
        for (int i = 1; i < 256; i++) {
            setBitsZeroTo255[i] = setBitsZeroTo255[(i & (i - 1))] + 1;
        }
    }

    public int hammingWeight(int n) {
        return setBitsZeroTo255[n & 255] +
                setBitsZeroTo255[((n >> 8) & 255)] +
                setBitsZeroTo255[((n >> 16) & 255)] +
                setBitsZeroTo255[(n >> 24)];
    }
}