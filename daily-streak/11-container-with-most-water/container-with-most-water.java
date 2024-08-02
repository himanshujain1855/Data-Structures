class Solution {
    public int maxArea(int[] height) {
        int leftHeightIndex=0;
        int rightHeightIndex=height.length-1;

        int maxWater=0;
        
        while(leftHeightIndex < rightHeightIndex){
            
            int leftHeight=height[leftHeightIndex];
            int rightHeight=height[rightHeightIndex];
            
            int width=rightHeightIndex-leftHeightIndex;
            boolean isLeftHeightSmaller=leftHeight < rightHeight;
            int heightInt=isLeftHeightSmaller ? leftHeight :rightHeight;
            
            int area=width * heightInt;

            maxWater= maxWater < area ? area :  maxWater;

            if(isLeftHeightSmaller){
                leftHeightIndex++;
            }else{
                rightHeightIndex--;
            }
        }

        return maxWater;
    }
}