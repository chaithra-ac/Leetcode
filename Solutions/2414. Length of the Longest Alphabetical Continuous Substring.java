// https://leetcode.com/problems/length-of-the-longest-alphabetical-continuous-substring/

class Solution {
    public int longestContinuousSubstring(String s) {
        int res=1,max=Integer.MIN_VALUE;
        if(s.length()==1)return res;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)-s.charAt(i-1)==1)
                ++res;
            else
                res=1;
                max=Math.max(res,max);
            
        }
        return max;
    }
}
