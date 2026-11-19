class Solution {
    public String removeStars(String s) {
       Stack<Character> stack = new Stack<>();
       for(char ch: s.toCharArray()){
        if(!stack.isEmpty() && ch == '*') stack.pop();
        else if(ch != '*') stack.push(ch);
       }
       String result="";
       while(!stack.isEmpty()){
        result=stack.pop()+result;
       }
       return result;
       
    }

}