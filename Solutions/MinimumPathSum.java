/*
https://leetcode.com/problems/minimum-path-sum/
*/
class Solution {
    int min=Integer.MAX_VALUE;
    int [][]dp;
    public int minPathSum(int[][] g) {
        dp=new int[g.length][g[0].length];
    
      return compute(g,g.length,g[0].length,0,0,0); 
    }
    int compute(int[][]g,int m,int n,int x,int y,int res){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(i==0){
                   dp[i][j]=g[i][j];
                   if(j>0)dp[i][j]=g[i][j]+dp[i][j-1];
               }
                    
                else if(j==0)
                    dp[i][j]=g[i][j]+dp[i-1][j];
                else 
                    dp[i][j]=g[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);
            }
        }
      return dp[m-1][n-1];   
    }
}
