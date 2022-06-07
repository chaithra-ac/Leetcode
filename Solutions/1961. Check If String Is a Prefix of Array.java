//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuffer sb=new StringBuffer();
      for(int i=0;i<words.length;i++){
          sb.append(words[i]);
          if(sb.length()>s.length())
              return false;
          else if(s.length()==sb.length()&&s.equals(sb.toString()))return true;
      } 
        return false;
    }
}
