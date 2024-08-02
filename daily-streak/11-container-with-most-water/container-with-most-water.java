class Solution {
    public int maxArea(int[] height) {
        int leftHeightIndex=0;
        int rightHeightIndex=height.length-1;

        int maxWater=0;
        
        while(leftHeightIndex < rightHeightIndex){
            
            int width=rightHeightIndex-leftHeightIndex;
            int leftHeight=height[leftHeightIndex];
            int rightHeight=height[rightHeightIndex];
            
            int heightInt=leftHeight < rightHeight ? leftHeight :rightHeight;
            
            maxWater=Math.max(maxWater,width * heightInt);

            if(leftHeight < rightHeight){
                leftHeightIndex++;
            }else{
                rightHeightIndex--;
            }
        }

        return maxWater;
    }
}