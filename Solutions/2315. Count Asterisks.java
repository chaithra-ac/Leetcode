// https://leetcode.com/problems/count-asterisks/
class Solution {
    public int countAsterisks(String s) {
        int f=0,sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'&&f==0)
                sum++;
            
            else if(s.charAt(i)=='|'&&f==0)
                f=1;
            
            else if(s.charAt(i)=='|'&&f==1)
                f=0;
        
            
        }
        return sum;
    }
}
