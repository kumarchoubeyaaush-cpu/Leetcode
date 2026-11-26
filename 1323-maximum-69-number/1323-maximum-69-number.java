class Solution 
{
    public int maximum69Number (int num) 
    {
       StringBuilder sb = new StringBuilder();
        sb.append(num);

        for(int i = 0; i < sb.length(); i++) 
        {
            if(sb.charAt(i) == '6') 
            {
                sb.setCharAt(i, '9');
                break;
            }
        }

        String result = sb.toString();
        int x = result.isEmpty() ? 0 : Integer.parseInt(result);
        return x;
    }
}