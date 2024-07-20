class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        int len = flowerbed.length;
        if(len==1 && flowerbed[0]==0){
            return true;
        }
        if (len > 1 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n = n - 1;
        }

        for (int i = 1; i < (len - 1); i++) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                n = n - 1;
                flowerbed[i] = 1;
                if (n == 0)
                    return true;
            }
        }

        if (len > 1 && flowerbed[len - 2] == 0 && flowerbed[len - 1] == 0) {
            n = n - 1;
        }

        if (n > 0)
            return false;
        return true;
    }
}