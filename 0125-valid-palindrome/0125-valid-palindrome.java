class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) 
            {
                ns.append(ch);
            }
        }
        return check(ns.toString());
    }
    boolean check(String s) 
    {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            rev.append(s.charAt(i));
        }
        return s.equals(rev.toString());
    }
}