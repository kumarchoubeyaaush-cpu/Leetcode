class Solution {
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
      
        final int INFINITY = 1 << 30;
        Arrays.fill(result, INFINITY);
      
        int previousCharPosition = -INFINITY;
        for (int i = 0; i < length; i++) 
        {
            if (s.charAt(i) == c) 
            {
                previousCharPosition = i;
            }
            result[i] = Math.min(result[i], i - previousCharPosition);
        }

        int nextCharPosition = INFINITY;
        for (int i = length - 1; i >= 0; i--) 
        {
            
            if (s.charAt(i) == c) 
            {
                nextCharPosition = i;
            }
            
            result[i] = Math.min(result[i], nextCharPosition - i);
        }
      
        return result;
    }
}