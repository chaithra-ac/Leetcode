class Solution {
    public void setZeroes(int[][] m) {
    boolean[][]b=new boolean[m.length][m[0].length];
     for(int i=0;i<m.length;i++){
             for(int j=0;j<m[0].length;j++){
                     if(m[i][j]==0&&b[i][j]==false){
                             System.out.println(i+" "+j);
                             dfs(m,i,j,b);
                     }
             }    
     }
    }
    void dfs(int[][]m,int i,int j,boolean[][]b){
             for(int a=0;a<m[0].length;a++){
                if(m[i][a]!=0&&b[i][a]==false){
                        m[i][a]=0;b[i][a]=true;
             }
        }
             for(int a=0;a<m.length;a++){
                if(m[a][j]!=0&&b[a][j]==false){
                        m[a][j]=0;b[a][j]=true;
                }
             }
        }
}
