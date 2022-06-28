// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/


class Solution {
    public int minDeletions(String s) {
       TreeMap<Character,Integer>map=new TreeMap<>();
        char c=s.charAt(0);
        int del=0,n=s.length(),cur=0;
        for(int i=0;i<n;i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         HashSet<Integer>set=new HashSet<>();
        for(int i:map.values()){
            cur=i;
            while(cur>0&&set.contains(cur)){
                cur--;del++;
            }
            set.add(cur);
        }
           
        return del;
    }
}
