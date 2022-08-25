// https://leetcode.com/problems/rotting-oranges/


class Solution {
    int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] g) {
        int m=g.length,n=g[0].length,max=0,c=0;
     Queue<Pair>q=new LinkedList<>();
     boolean[][]b=new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==2){
                    q.add(new Pair(i,j,0));
                    b[i][j]=true;
                }
                if(g[i][j]==1)++c;
            }
        }
        while(!q.isEmpty()){
           Pair temp=q.remove();
            
            if(temp.min>max)
                max=temp.min;
            
            for(int[]adj:dir){
                int x=temp.i+adj[0];
                int y=temp.j+adj[1];
                if(x>=m||y>=n||x<0||y<0||b[x][y])
                    continue;
                else if(g[x][y]==1){
                    q.add(new Pair(x,y,temp.min+1));
                    b[x][y]=true;--c;
                }
            }
        }
        return c>0?-1:max;
    }
}
class Pair{
    int i;
    int j;
    int min;
    Pair(int i,int j,int min){
        this.i=i;
        this.j=j;
        this.min=min;
    }
}
