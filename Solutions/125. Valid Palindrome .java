// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
      String format=s.toLowerCase();
        format=format.replaceAll("[^a-z0-9]", "");
        StringBuilder sb=new StringBuilder(st);
        return st.equals(sb.reverse().toString());
              
    }
}
