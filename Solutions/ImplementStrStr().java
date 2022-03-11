//https://leetcode.com/problems/implement-strstr/
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
for(int i=0;i<haystack.length();i++){
           if(haystack.charAt(i)==needle.charAt(0)){
               if(check(haystack.substring(i),needle)==true)
           return i;
            }
    }
       return -1; 
    }
 boolean check(String s1,String s2){
     if(s1.length()<s2.length())return false;
String s3=s1.substring(0,s2.length());
     return s3.equals(s2);
        }
    
}
