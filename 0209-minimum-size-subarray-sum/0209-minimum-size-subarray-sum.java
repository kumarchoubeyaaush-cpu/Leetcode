class Solution {
  public int minSubArrayLen(int target, int[] nums) {
        int s =0;
        int e=0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(; e<nums.length; e++)
        {
            sum+=nums[e];

            while(sum >= target)
            {
                int size = e-s+1;
                min = Math.min(min , size);
                sum-=nums[s++];
            }

        }
        return min == Integer.MAX_VALUE ? 0 : min;
  }
} 