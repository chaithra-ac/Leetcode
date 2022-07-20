// https://leetcode.com/problems/number-of-matching-subsequences/
class Solution {
    public int numMatchingSubseq(String s, String[] words) {
      HashMap<Character,ArrayList<Integer>>map=new HashMap<>();
        
       for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i)))
           map.get(s.charAt(i)).add(i);
        else {
            map.put(s.charAt(i),new ArrayList<Integer>());
            map.get(s.charAt(i)).add(i);
            }
       }
        int count=0;
        for(int i=0;i<words.length;i++){
            String w=words[i];
            int j=0,pre=-1;
            while(j<w.length()){
                int f=0;
                if(map.containsKey(w.charAt(j))){
                  for(int k:map.get(w.charAt(j))){
                      if(pre<k){
                          pre=k;f=1;
                          break;
                      }}}
                if(j==w.length()-1)count++;
                if(f==0)break;
                j++;
            }
        }
           return count;
    }
}
