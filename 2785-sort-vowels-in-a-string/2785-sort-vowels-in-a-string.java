class Solution {
    public String sortVowels(String s) {
        String vowel = "aeiouAEIOU";
        char ch[]=s.toCharArray();
        String str="";
        for(char c: ch)
        {
            if(vowel.indexOf(c)!=-1)
            {
                str+=c;
            }
        }
        char chVowel[]=str.toCharArray();
        Arrays.sort(chVowel);
        for(int i=0,k=0;i<ch.length;i++)
        {
            if(vowel.indexOf(ch[i])!=-1)
            {
                ch[i]=chVowel[k++];
            }
        }
        return new String(ch);
    }
}