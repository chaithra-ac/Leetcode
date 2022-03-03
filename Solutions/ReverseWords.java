class Solution {
    public String reverseWords(String s) {
        int l=s.length()-1;
        
        String word="";
        String string="";
        
     for(int i=s.length()-1;i>=0;i--){
         
         if(s.charAt(i)!=' ')
             word+=s.charAt(i);
         
         else{
              string=" "+word+string;
              word="";
          }
     }
        return word+string;
    }
}
