class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        // char a1[]=s.toCharArray();
        // char a2[]=t.toCharArray();
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // return Arrays.equals(a1,a2);
        int f1[]= new int [26];
        for(char ch:s.toCharArray())
        {
            f1[ch-'a']++;
        }       
        int f2[]= new int [26];
        for(char ch:t.toCharArray())
        {
            f2[ch-'a']++;
        }
        //System.out.println(Arrays.toString(f1));
        return Arrays.equals(f1,f2);
    }   
}