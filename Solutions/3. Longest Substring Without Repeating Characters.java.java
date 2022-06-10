// https://leetcode.com/problems/longest-substring-without-repeating-characters/

// approach 1 (using index to truncate repeated part)
class Solution {
    int max=0;
    public int lengthOfLongestSubstring(String s) {
       StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            
            int index=sb.indexOf(""+s.charAt(i));
            
            if(index==-1)
                sb.append(s.charAt(i));
            
            else if(index<sb.length()){
                sb=new StringBuffer(sb.substring(index+1));
                sb.append(s.charAt(i));
            }
            
        max=Math.max(sb.length(),max);
            
        }
        return max;
    }
}


//approach 2(using set)
class Solution {
    int max=0;
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        HashSet<Character>map=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!map.contains(s.charAt(i)))
                map.add(s.charAt(i));
            else{
                while(map.contains(s.charAt(i))){
                    map.remove(s.charAt(j++));
                }
            map.add(s.charAt(i));
            }
            max=Math.max(max,map.size());
                
        }
        return max;
    }
}
