// https://leetcode.com/problems/word-pattern/description/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] ary = s.split(" ");
        if (pattern.length() != ary.length)
            return false;
        for (int i = 0; i < ary.length; i++) {
            if (map.containsKey(pattern.charAt(i))){
                    if(!map.get(pattern.charAt(i)).equals(ary[i]))
                return false;
            }else{
                if(map.containsValue(ary[i]))
                    return false;
                map.put(pattern.charAt(i), ary[i]);
            }
        }
        return true;
    }
}
