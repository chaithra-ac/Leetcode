// https://leetcode.com/problems/break-a-palindrome/description/

class Solution {
    public String breakPalindrome(String palindrome) {
        int len=palindrome.length();
        if(len==1)return "";
    char[]ch=palindrome.toCharArray();
         for(int i=0;i<len/2;i++){
             if(ch[i]!='a'){
                 ch[i]='a';
                 return String.valueOf(ch);

             }
         } 
         if(ch[len-1]=='a'){
             ch[len-1]='b';
             return String.valueOf(ch);
         }
         return "";
    }
}
