// https://leetcode.com/problems/number-of-enclaves/
class Solution {
    int f,res;
    public int numEnclaves(int[][] grid) {
      int m=grid.length,n=grid[0].length;
        boolean[][]vis=new boolean[m][n];
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(!vis[i][j]&&grid[i][j]==1){
                    f=0;
                    int temp=dfs(grid,vis,m,n,i,j);
                    if(f==0)res+=temp;
                }     
            }
        } 
        return res;
    }
    int dfs(int[][]g,boolean[][]b,int m,int n,int i,int j){
        if(i<0||j<0||i>=m||j>=n){
            f=1;return 0;
        }
        else if(b[i][j]||g[i][j]==0)
            return 0;
        b[i][j]=true;
        return 1+dfs(g,b,m,n,i+1,j)+dfs(g,b,m,n,i-1,j)+
            dfs(g,b,m,n,i,j+1)+dfs(g,b,m,n,i,j-1);
        
    }
}
