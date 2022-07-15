/*
https://leetcode.com/problems/max-area-of-island/
*/


class Solution {
    int max=0;
    public int maxAreaOfIsland(int[][] g) {
        int m=g.length,n=g[0].length;
        boolean[][]vis=new boolean[m][n];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(!vis[i][j]&&g[i][j]==1)
                  max=Math.max(max,dfs(i,j,vis,g));
          }
      } 
        return max;
    }
    public int dfs(int i,int j,boolean[][]vis,int[][]g){
        if(i<0||j<0||i>=g.length||j>=g[0].length||vis[i][j]||g[i][j]==0)
            return 0;
        vis[i][j]=true;
        return 1+dfs(i+1,j,vis,g)+
            dfs(i,j+1,vis,g)+
            dfs(i-1,j,vis,g)+
            dfs(i,j-1,vis,g);   
    }
}
