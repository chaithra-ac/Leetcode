// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
      String format=s.toLowerCase();
        format=format.replaceAll("[^a-z0-9]", "");
        StringBuilder sb=new StringBuilder(format);
        return format.equals(sb.reverse().toString());         
    }
}
