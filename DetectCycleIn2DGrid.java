class Solution {
    public boolean containsCycle(char[][] g) {
        int m=g.length,n=g[0].length;
        boolean [][]b=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                
                if(!b[i][j]&&dfs(g,i,j,m,n,b,g[i][j]))
                    return true;
                
                
            
        }
                return false;
    }
    boolean dfs(char[][]g,int i,int j,int m,int n,boolean[][]v,char a){
        if(i>=m||j>=n||i<0||j<0||g[i][j]!=a)
            return false;
        
        else if(v[i][j])
            return true;
        
                
        v[i][j]=true;
        char dummy=g[i][j];
         g[i][j]='*';
        boolean has=
            dfs(g,i+1,j,m,n,v,a)||
            dfs(g,i-1,j,m,n,v,a)||
            dfs(g,i,j+1,m,n,v,a)||
            dfs(g,i,j-1,m,n,v,a);
        g[i][j]=dummy;
        return has;
    }
}
