// https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
     HashMap<Character,Integer>map=new HashMap<>();
        
        if(s.length()!=t.length())return false;
        
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        for(int i=0;i<s.length();i++){
             int temp=map.containsKey(t.charAt(i))?map.get(t.charAt(i)):0;
              if(temp>0){
               map.put(t.charAt(i),temp-1);
              }
            else return false;
        }
//         for(int i:map.values())
//             if(i>0)return false;
        return true;
    }
}
