class Solution {
    public int trap(int[] height)
    {
        int leftMax=0, rightMax=0, l=0, r=height.length-1;
        int totalWater=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]<leftMax)
                {
                    totalWater+=leftMax-height[l];
                }
                else
                {
                    leftMax=height[l];
                }
                l++;
            }
            else
            {
                if(height[r]<rightMax)
                {
                    totalWater+=rightMax-height[r];
                }
                else
                {
                    rightMax=height[r];
                }
                r--;
            }
        }
        return totalWater;
        
    }
}
