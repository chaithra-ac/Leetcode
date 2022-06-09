//https://leetcode.com/problems/island-perimeter/

class Solution {
    int[]di={0,1,0,-1};
    int[]dj={1,0,-1,0};
    int peri=4,flag=0,res=0;
    boolean[][]vis;
    public int islandPerimeter(int[][] g) {
        vis=new boolean[g.length][g[0].length];
      for(int i=0;i<g.length;i++){
          for(int j=0;j<g[0].length;j++){
              if(g[i][j]==1)
                  return bfs(i,j,g,peri);
          
          }  
      }
        return 0;
    }
   int bfs(int a,int b,int[][]g,int p){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(a,b));
         vis[a][b]=true;
        while(!q.isEmpty()){
            Pair land=q.poll();
            for(int i=0;i<di.length;i++){
                int x=land.i+di[i];
                int y=land.j+dj[i];
                if(x>=0&&y>=0&&x<g.length&&y<g[0].length&&g[x][y]==1){
                    peri-=1;
                    flag=1;
                    if(!vis[x][y]){
                        vis[x][y]=true;
                    q.add(new Pair(x,y));
                    }
                }
                
            }
            res+=peri;
            peri=4;
        }
        if(flag==0)return peri; 
        return res;
    }
    
}
class Pair{
    int i;int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
