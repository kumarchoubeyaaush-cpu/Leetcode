class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int l = 1;
        int max = 0;
        for(int p:piles)
        {
            max = Math.max(max , p);
        }
        int ans = -1;
        int r = max;
        while(l <= r)          // log n times
        {
            int mid = l + (r - l) / 2;
            long hrs = hours(piles , mid);    // O(n)
            if(hrs <= h)
            {
                ans = mid;
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return ans;

    }
    long hours(int piles[], int k)
    {
        long hrs = 0;
        for(int p : piles)
        {
            hrs += p / k;
            if(p%k != 0 )
            {
                hrs++;
            }
        }
        return hrs;
    }
}