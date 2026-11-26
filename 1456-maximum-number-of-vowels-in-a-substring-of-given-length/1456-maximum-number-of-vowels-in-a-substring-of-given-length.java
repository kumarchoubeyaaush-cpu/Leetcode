class Solution {
    public int maxVowels(String s, int k){
        int maxCount=0; 
        int count=0;
        char ch[]=s.toCharArray();
        int l = ch.length;
        for(int j=0;j<k;j++)
        {
            if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u')
            {
                 count++;
            }
        }
        maxCount=Math.max(maxCount, count);

        for(int i=k;i<l;i++)
        {
            if(ch[i-k] == 'a' || ch[i-k] == 'e' || ch[i-k] == 'i' || ch[i-k] == 'o' || ch[i-k] == 'u'){
                count--;
            }
             if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') 
            {
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}