// https://leetcode.com/problems/find-unique-binary-string/
class Solution {
    public String findDifferentBinaryString(String[] nums) {
       Set<String>set=new HashSet<>();
        for(String s:nums)set.add(s);
        int len=nums.length;
        String cur="",unique="";
        int n=(int)Math.pow(2,len);
        
        for(int i=0;i<=n;i++){
           cur=Integer.toBinaryString(i);
           unique=cur+(Integer.toBinaryString(1<<(len-cur.length()))).substring(1);
            if(!set.contains(unique))return 
                unique;
        }
        return "";
    }
}


//slight modified))instead of converting each store straight away integers into set and convert only if particular unique bs isnt present!
class Solution {
    public String findDifferentBinaryString(String[] nums) {
       Set<Integer>set=new HashSet<>();
        
        for(String s:nums)
            set.add(Integer.parseInt(s,2));
        int len=nums.length;
        String cur="";
        int n=(int)Math.pow(2,len);
        
        for(int i=0;i<=n;i++){
            
            if(!set.contains(i)){
               cur=Integer.toBinaryString(i);
            return (Integer.toBinaryString(1<<(len-cur.length()))).substring(1)+cur;
            }
        }
        return "";
    }
}
