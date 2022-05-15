//https://leetcode.com/problems/group-anagrams/

class Solution {
    Map<String,List<String>> map=new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for(int i=0;i<strs.length;i++){
          char[]temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String s=String.valueOf(temp);
            if(!map.containsKey(s))
                map.put(s,new ArrayList());
                map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
