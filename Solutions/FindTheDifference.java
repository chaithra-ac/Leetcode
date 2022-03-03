class Solution {
    public char findTheDifference(String s, String t) {
     char ans=t.charAt(t.length()-1);
        for(int i=0;i<s.length();i++){
           ans^=s.charAt(i)^t.charAt(i); 
        }
        return ans;
        
    }
}













/*
class Solution {
    public char findTheDifference(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);Arrays.sort(c2);
        for(int c=0;c<c1.length;c++){
            if(c1[c]!=c2[c])
                return c2[c];
        }
        return c2[c2.length-1];
    }
}
*/
