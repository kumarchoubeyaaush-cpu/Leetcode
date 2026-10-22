class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0,j=height.length-1;
        while(i<j)
        {
            int h = Math.min(height[i] , height[j]);
            int w = j-i;
            int area = h*w;
            max = Math.max(area,max);
            if(height[i] < height[j])
            i++;
            else
            j--;
        }
        return max;
    }
}