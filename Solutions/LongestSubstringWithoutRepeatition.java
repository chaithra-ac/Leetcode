class Solution {
    int max=0;
    public int lengthOfLongestSubstring(String s) {
       StringBuffer temp=new StringBuffer(""); 
       for(int i=0;i<s.length();i++){
           if(temp.indexOf(""+s.charAt(i))==-1)
               temp.append(s.charAt(i));
           else if(temp.indexOf(""+s.charAt(i))!=-1){
               temp=new StringBuffer(temp.substring(temp.indexOf(""+s.charAt(i))+1));
               temp.append(s.charAt(i));
           }
            if(max<temp.length())
                max=temp.length();
     
       }
        return max;
    }
}
