/*
https://leetcode.com/problems/flood-fill/
*/
class Solution {
    boolean[][]vis;
    int m,n,cur,color;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        m=image.length;
        n=image[0].length;
        vis=new boolean[m][n];
        cur=image[sr][sc];
        color=newColor;
        
        dfs(image,sr,sc);
        return image;
    }
    void dfs(int[][]g,int i,int j){
        if(i<0||j<0||i>=m||j>=n||vis[i][j]||g[i][j]!=cur)return;
        if(g[i][j]==cur){
        vis[i][j]=true;
        g[i][j]=color;
            dfs(g,i+1,j);
            dfs(g,i,j+1);
            dfs(g,i-1,j);
            dfs(g,i,j-1);
            
        }
        
    }
}
