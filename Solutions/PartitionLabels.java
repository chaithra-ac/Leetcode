//https://leetcode.com/problems/partition-labels/

class Solution {
    HashMap<Character,Integer>map=new HashMap<>(26);
    List<Integer>list=new ArrayList<>();
    public List<Integer> partitionLabels(String s) {
        
      int start=0,max=0;
    
      for(int i=0;i<s.length();i++)
          map.put(s.charAt(i),i);
        
        for(int i=0;i<s.length();i++){
            
           max=Math.max(max,map.get(s.charAt(i))); 
            if(max==i){
                list.add(i+1-start);
                start=i+1;
            }
        }
        
     return list;   
    }
}
