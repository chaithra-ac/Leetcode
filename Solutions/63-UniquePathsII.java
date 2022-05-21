/*
https://leetcode.com/problems/unique-paths-ii
*/
//approach 1

class Solution {
    public int uniquePathsWithObstacles(int[][] t) {
    int m=t.length,n=t[0].length;
        if(t[0][0]==1||t[m-1][n-1]==1)return 0;
        int f=0;
        for(int i=0;i<m;i++){
                if(t[i][0]==0&&f==0)
                t[i][0]=1;
                else {t[i][0]=0;f=1;}
        }
        f=0;
        for(int i=1;i<n;i++){
            if(t[0][i]==0&&f==0)
            t[0][i]=1;
            else {t[0][i]=0;f=1;}
        }
      for(int i=1;i<m;i++){
       for(int j=1;j<n;j++){
           if(t[i][j]==1)t[i][j]=0;
           else
        t[i][j]=t[i-1][j]+t[i][j-1];  
           System.out.print(t[i][j]+" ");
    }
}
        return t[m-1][n-1];
        }
}


//approch 2
class Solution {
    int max=Integer.MAX_VALUE;
    public int uniquePathsWithObstacles(int[][] g) {
        int m=g.length,n=g[0].length;
        if(g[0][0]==1||g[m-1][n-1]==1)return 0;
        int one=1;
        for(int i=0;i<m;i++){
         if(g[i][0]==0)
             g[i][0]=one;
            else{
                g[i][0]=max;
                one=max;
            }    
        }
        one=1;
        for(int j=1;j<n;j++){
          if(g[0][j]==0)
              g[0][j]=one;
              else{
                  g[0][j]=max;
                  one=max;
              } 
        }
        
      for(int i=1;i<m;i++){
       for(int j=1;j<n;j++){
           if(g[i][j]==1){
              g[i][j]=max; 
           }
           else if(g[i-1][j]==max)
               g[i][j]=g[i][j-1];
           else if(g[i][j-1]==max)
               g[i][j]=g[i-1][j];
           else
        g[i][j]=g[i-1][j]+g[i][j-1];
       }
      }
        return g[m-1][n-1]==max?0:g[m-1][n-1];
    }
}

