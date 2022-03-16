//https://leetcode.com/problems/validate-stack-sequences/
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
     Stack<Integer>stack=new Stack<>();
       int  j=0,i=1,n=popped.length;
        stack.push(pushed[0]);
     while(j<n){
         // System.out.println(stack+" "+i+" "+j);
         
       if(!stack.isEmpty()&&stack.peek()==popped[j]){
          stack.pop();
          j++;
       }
       else if(i<n)
          stack.push(pushed[i++]);
            
       else
          return false;
         
     }
     return j==n;
    }
}
