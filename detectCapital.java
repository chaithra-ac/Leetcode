class Solution {
    public boolean detectCapitalUse(String word) {
     if(word.length()==1)return true;
        if(Character.isUpperCase(word.charAt(1)))
           return Character.isUpperCase(word.charAt(0))&&check(word,'A','Z'); 
        else
          return check(word,'a','z');  
    }
    boolean check(String w,char a,char b){
        int i=1,j=w.length();
        while(i<j){
            if(!(w.charAt(i)>=a&&w.charAt(i)<=b))
                return false;
            i++;
        }
        return true;
    }
}
