/*
https://leetcode.com/problems/shortest-path-in-binary-matrix/submissions/
*/
//approach 1=bfs

private int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};

    public int shortestPathBinaryMatrix(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0]==1 || grid[m-1][n-1]==1) {
            return -1;
        }

        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        int ans=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                int[] pop = queue.remove();
                if(pop[0]==m-1 && pop[1]==n-1) {
                    return ans+1;
                }
                for (int k=0;k<8;k++) {
                    int nextX = dir[k][0]+pop[0];
                    int nextY = dir[k][1]+pop[1];

                    if(nextX>=0 && nextX<m && nextY>=0 && nextY<n && !visited[nextX][nextY] && grid[nextX][nextY]==0) {
                        queue.add(new int[]{nextX,nextY});
                        visited[nextX][nextY]=true;
                    }

                }
            }
            ans++;
        }

        return -1;
    }

//approach 2=dfs
class Solution {
    int m,n,min=Integer.MAX_VALUE;
    boolean[][]b;
    public int shortestPathBinaryMatrix(int[][] g) {
        m=g.length;
        n=g[0].length;
        b=new boolean[m][n];
        compute(0,0,g,0);
        return min==Integer.MAX_VALUE?-1:min;
    }
    void compute(int i,int j,int[][]g,int cur){
        if(i<0||j<0||i>=m||j>=n||g[i][j]==1||b[i][j])
            return;
        cur+=1;
        if(i==m-1&&j==n-1&&cur<min){
           min=cur;
            return;
        }
        b[i][j]=true;
        compute(i+1,j+1,g,cur);
        compute(i-1,j-1,g,cur);
        compute(i,j+1,g,cur);
        compute(i,j-1,g,cur);
        compute(i+1,j,g,cur);
        compute(i-1,j+1,g,cur);
        compute(i+1,j-1,g,cur);
        compute(i-1,j,g,cur);
        b[i][j]=false;
            
    }
    
}
