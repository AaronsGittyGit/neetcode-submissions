class Solution {
    public int maxArea(int[] heights) {
        
        int indexI;
        int indexJ;
        int container, height, unitWater;
        int max = 0;
        
        indexI = 0;
        indexJ = heights.length - 1;


        while (indexI < indexJ) {

            container = Math.abs(indexI - indexJ);
            height = Math.min(heights[indexI], heights[indexJ]);

            unitWater = container * height;

            max = Math.max(max , unitWater);
            

            if (heights[indexI] < heights[indexJ]) {
                indexI++;
                
            } else {
                indexJ--;
                
            }

        }

        return max;


    }
}
