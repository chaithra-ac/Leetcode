class Solution {
    public int numIslands(char[][] g) {
        int m=g.length,n=g[0].length,ans=0;
     boolean[][]b=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]=='1'&&b[i][j]==false){
                    compute(i,j,g,b,m,n);
                    ans++;
                }
            }
        }
        return ans;
    }
    void compute(int i,int j,char [][]g,boolean[][]b,int m,int n){
       if(i>=m||i<0||j>=n||j<0||b[i][j]==true||g[i][j]=='0')return;
        b[i][j]=true;
        compute(i+1,j,g,b,m,n);
        compute(i-1,j,g,b,m,n);
        compute(i,j+1,g,b,m,n);
        compute(i,j-1,g,b,m,n);
        
    }
}
