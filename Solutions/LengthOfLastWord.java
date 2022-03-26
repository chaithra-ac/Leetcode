//https://leetcode.com/problems/length-of-last-word/


class Solution {
    public int lengthOfLastWord(String s) {
     String []sa=s.split(" ");
        return sa[sa.length-1].length();
    }
}
