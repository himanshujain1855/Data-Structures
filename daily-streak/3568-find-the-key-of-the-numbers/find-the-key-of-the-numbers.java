class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int counter = 0;
        StringBuilder strBuilder = new StringBuilder();

        int[] chars = new int[4];

        while (counter < 4) {
            int d1 = num1 % 10;
            num1 /= 10;

            int d2 = num2 % 10;
            num2 /= 10;

            int d3 = num3 % 10;
            num3 /= 10;

            int d = Math.min(Math.min(d1, d2), d3);

            chars[3 - counter] = d;
            counter++;
        }
        int ans=0;

        for (int i = 0; i < 4; i++) {
            ans= ans * 10 + chars[i];
        }
        return ans;
    }
}