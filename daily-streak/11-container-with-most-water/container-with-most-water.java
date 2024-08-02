class Solution {
    public int maxArea(int[] height) {
        int len=height.length;

        int leftSideHeightIndex=0;
        int rightSideHeightIndex=len-1;

        int maxWater=0;
        
        while(leftSideHeightIndex < rightSideHeightIndex){
            int width=rightSideHeightIndex-leftSideHeightIndex;
           
            int heightInt=Math.min(height[leftSideHeightIndex],height[rightSideHeightIndex]);

            maxWater=Math.max(maxWater,width * heightInt);

            if(height[leftSideHeightIndex] < height[rightSideHeightIndex]){
                leftSideHeightIndex++;
            }else{
                rightSideHeightIndex--;
            }
        }

        return maxWater;
    }
}