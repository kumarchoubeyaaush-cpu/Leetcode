class Solution {
    public boolean backspaceCompare(String s, String t) {
        return modify(s).equals(modify(t));
    }
    public String modify(String s){
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch!='#')st.push(ch);
            else if (!st.isEmpty()) st.pop();
        }
        return st.toString();
    }
}