class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) 
        {
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) 
        {
            charCount[t.charAt(i) - 'a']--;
            if (charCount[t.charAt(i) - 'a'] < 0) 
            {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}