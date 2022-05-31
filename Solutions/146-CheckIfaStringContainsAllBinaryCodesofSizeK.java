//https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
//approach 1 =using set to store unique and roll over string of window size k and finally compare it with the length of substrings can be formed from k
class Solution {
    public boolean hasAllCodes(String s, int k) {
       Set<String>set=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++)
           set.add(s.substring(i,i+k)); 
        
        return Math.pow(2,k)==set.size();
    }
}

// approach 2
//generate all substring and check if that substring is present in string

class Solution {
    List<String>list=new ArrayList<>();
    public boolean hasAllCodes(String s, int k) {
    return compute(s,"",k); 
    }
   boolean compute(String s,String temp,int k){
        if(temp.length()==k){
            
            if(s.contains(temp))
            return true;
            
            if(!s.contains(temp))
            return false;
                
        }
        return compute(s,temp+0,k)&&compute(s,temp+1,k);
    }
}
