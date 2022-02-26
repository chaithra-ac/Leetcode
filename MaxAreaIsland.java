/*
https://leetcode.com/problems/max-area-of-island/
*/


class Solution {
    boolean[][]b;
    int m,n,r=0;
    public int maxAreaOfIsland(int[][] g) {
      m=g.length;
        n=g[0].length;
        b=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!b[i][j]&&g[i][j]==1)
                    r=Math.max(compute(g,i,j,0),r);
            }
        }
        return r;
    }
    int compute(int[][]g,int i,int j,int res){
        if(i<0||j<0||i>=m||j>=n||b[i][j]||g[i][j]==0)
            return 0;
        b[i][j]=true;
        res+=1+compute(g,i+1,j,res)+
               compute(g,i-1,j,res)+
               compute(g,i,j+1,res)+
               compute(g,i,j-1,res);
            
          return res;  
    }
}
