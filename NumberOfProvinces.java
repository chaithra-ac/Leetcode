class Solution {
    public int findCircleNum(int[][] g) {
       int n=g.length,c=0;
        boolean[]b=new boolean[n];
        for(int i=0;i<n;i++){
            if(!b[i]){
                c++;
                dfs(g,i,b,n);
            }
        }
        return c;
    }
    void dfs(int[][]g,int i,boolean[]b,int n){
        for(int j=0;j<n;j++){
            if(!b[j]&&g[i][j]==1){
                b[j]=true;
                dfs(g,j,b,n);
            }
        }
    }
}
