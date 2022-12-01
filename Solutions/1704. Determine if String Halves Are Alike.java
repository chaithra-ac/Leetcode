// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
class Solution {
    public boolean halvesAreAlike(String s) {
        char[] ch=s.toCharArray();
        int count=0;

        for(int i=0;i<ch.length/2;i++)
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||
               ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                ++count;

        for(int i=ch.length/2;i<s.length();i++)
           if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||
               ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                --count;

        
    return count==0;
    }
}
