class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> l = new ArrayList<>();
        fun("", 0, 0, n,l);
        return l;
    }
    void fun(String p, int o, int c, int n, List<String> l)
    {
        if(o==n && c==n){
            l.add(p);
            return;
        }
        // opening call 
        if(o<n){
            fun(p+"(", o+1, c, n, l);
        }
        if(c<o){
            fun(p+")", o, c+1, n, l);
        }
    }
}