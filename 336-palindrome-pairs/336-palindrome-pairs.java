class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(words == null || words.length == 1)return ans;
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i = 0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            map.put(sb.reverse().toString(),i);
        }
        
        if(map.containsKey("")){
            for(int i = 0;i<words.length;i++){
                if(isPali(words[i]) && i != map.get("")){
                    ans.add(Arrays.asList(map.get(""),i));
                }
            }
        }
        
        for(int i = 0;i<words.length;i++){
            for(int j = 0;j<words[i].length();j++){
                
                String pre = words[i].substring(0,j);
                String suff = words[i].substring(j);
                
                if(map.containsKey(pre) && isPali(suff) && map.get(pre) != i){
                    ans.add(Arrays.asList(i,map.get(pre)));
                }
                
                if(map.containsKey(suff) && isPali(pre) && map.get(suff) != i){
                     ans.add(Arrays.asList(map.get(suff),i));
                }

            }
        }
        return ans;
    }
     public boolean isPali(String s){
         char[] c = s.toCharArray();
         int i=0,j=c.length-1;
         while(i<j){
             if(c[i] != c[j])return false;
             i++;
             j--;
         }
         return true;
     }
}
