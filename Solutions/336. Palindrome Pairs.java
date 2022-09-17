// https://leetcode.com/problems/palindrome-pairs/

// [TLE]
class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        String concats="",concatr="";
        Map<String,Boolean>map=new HashMap<>();
        List<List<Integer>>res=new ArrayList<>();
      for(int i=0;i<words.length;i++) {
          for(int j=i+1;j<words.length;j++){
              
             if(checkPalindrome(words[i]+words[j],map))
                  res.add(Arrays.asList(i,j));
              if(checkPalindrome(words[j]+words[i],map))
                  res.add(Arrays.asList(j,i));    
          }
      }
        return res;
    }
    boolean checkPalindrome(String concats,Map<String,Boolean>map){
          if(map.containsKey(concats)){
            return map.get(concats);
        }
      
        StringBuilder concatr=new StringBuilder();
              int len=concats.length();
              if(len%2==0)
               concatr.append(concats.substring(len/2,len)).reverse();
              else
               concatr.append(concats.substring(len/2+1,len)).reverse(); 
            if(concats.substring(0,len/2).equals(concatr.toString())||
                     concats.substring(0,len/2).equals(concatr.toString())){
                      map.put(concats,true);
                      return true;
                  }
                  map.put(concats,false);
        return false;
 
    }
}
