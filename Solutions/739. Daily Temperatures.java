
// https://leetcode.com/problems/daily-temperatures/
class Solution {
    public int[] dailyTemperatures(int[] t) {
        
      int n=t.length;
      int []res=new int[n];
        
      Stack<Integer>stack=new Stack<>();
        stack.push(n-1);
        
       for(int i=n-1;i>=0;i--){
           while(!stack.isEmpty()&&t[stack.peek()]<=t[i])
               stack.pop();
           
           if(!stack.isEmpty())
               res[i]=stack.peek()-i;
         
           stack.add(i);   
       } 
      return res;  
    }
}
