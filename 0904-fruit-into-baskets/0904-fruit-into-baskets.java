class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int n = fruits.length;
        int fr[] = new int[n];
        int type=0;
        int s=0,e=0;
        for(;e<n;e++)
        {
            int ft = fruits[e];
            if(fr[ft] == 0)
            {
                type++;
            }
            fr[ft]++;
            while(type>2)
            {
                int st = fruits[s];
                fr[st]--;
                if(fr[st] == 0)
                {
                    type--;
                }
                s++;
            }
            int size = e-s+1;
            max = Math.max(max,size);
       }
        return max;
    }
}