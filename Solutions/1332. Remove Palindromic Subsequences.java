//https://leetcode.com/problems/remove-palindromic-subsequences/
class Solution {
    public int removePalindromeSub(String s) {
      if(isPalindromic(s))return 1;
        else return 2;
    }
    boolean isPalindromic(String s){
        int i=0,j=s.length()-1;
        while(i<j&&j>=0){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}
