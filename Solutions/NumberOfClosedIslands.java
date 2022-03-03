/*
https://leetcode.com/problems/number-of-closed-islands/
*/
class Solution{
    int m,n,cnt;
    public int closedIsland(int[][] grid) {
        
        m=grid.length;
        n=grid[0].length;
        
        for (int i = 1; i <m-1; ++i)
            for (int j = 1; j < n-1; ++j)
                if (grid[i][j] == 0)
                    cnt += dfs(i, j, grid);
        return cnt;
    }
    
    private int dfs(int i, int j, int[][] g) {
        if (i < 0 || i >=m || j < 0 || j >=n)
            return 0;
        if (g[i][j] >0)
            return 1;
        g[i][j]=1000;
        return dfs(i + 1, j, g) 
            * dfs(i - 1, j, g) * 
            dfs(i, j + 1, g) * 
            dfs(i, j - 1, g);
    }
}
