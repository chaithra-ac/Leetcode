//https://leetcode.com/problems/triangle/
class Solution {
    int prev,a,b;
    public int minimumTotal(List<List<Integer>> list) {
        int n=list.size(),sum=list.get(0).get(0);
        int dp[]=new int[n+1];
      for(int i=n-1;i>=0;i--){
          for(int j=0;j<list.get(i).size();j++){
               a=list.get(i).get(j);
            dp[j] = Math.min(dp[j],dp[j+1])+a;              
          }
      } 
        return dp[0];
      }
}
