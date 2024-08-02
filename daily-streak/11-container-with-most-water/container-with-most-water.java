class Solution {
    public int maxArea(int[] height) {
        int leftHeightIndex=0;
        int rightHeightIndex=height.length-1;

        int maxWater=0;
        
        while(leftHeightIndex < rightHeightIndex){
            
            int leftHeight=height[leftHeightIndex];
            int rightHeight=height[rightHeightIndex];
            
            int width=rightHeightIndex-leftHeightIndex;
            int heightInt=leftHeight < rightHeight ? leftHeight :rightHeight;
            
            int area=width * heightInt;

            maxWater= maxWater < area ? area :  maxWater;

            if(leftHeight < rightHeight){
                leftHeightIndex++;
            }else{
                rightHeightIndex--;
            }
        }

        return maxWater;
    }
}