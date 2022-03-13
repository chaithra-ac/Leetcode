// https://leetcode.com/problems/repeated-substring-pattern/
class Solution {
        
        public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
                // System.out.print(s.substring(1,s.length()-1));
        return str.substring(1, str.length() - 1).contains(s);
    }

}
