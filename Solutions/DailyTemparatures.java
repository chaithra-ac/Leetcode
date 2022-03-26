//https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int n=temperatures.length,r=0;
        int[]res=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            int cur=temperatures[i];
            while(!stack.isEmpty()&&cur>temperatures[stack.peek()]){
                int prev=stack.pop();
                res[prev]=i-prev;
            }
            stack.push(i);    
        }
        return res;
    }
}
