/*
https://leetcode.com/problems/happy-number/
*/
class Solution {
    int s=0;
    List<Integer>l=new ArrayList<>();
    public boolean isHappy(int n) {
        s=n;
      while(!l.contains(s)&&s<Integer.MAX_VALUE){
          l.add(s);
          if(happy(s))
              return true;
      } 
    return false;
    }
    
    
    boolean happy(int n){
        int sum=0;
        while(n>0){
           int re=n%10;
            sum+=(re*re);
            n=n/10;
        }
         s=sum;
        return s==1;
    }
}
