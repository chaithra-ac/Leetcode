// https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/

class Solution {

    public int nearestExit(char[][] maze, int[] entrance) {
        int dir[]={1,-1};
       int m=maze.length,n=maze[0].length;
       boolean [][]vis=new boolean[m][n];
       Queue<Pair>q=new LinkedList<>(); 
       q.add(new Pair(entrance[0],entrance[1],0));
       vis[entrance[0]][entrance[1]]=true;
       while(!q.isEmpty()){
           Pair cur=q.remove();
           if((cur.x==m-1||cur.y==n-1||cur.x==0||cur.y==0)
           &&!(cur.x==entrance[0]&&cur.y==entrance[1]))
             return cur.dis;
             for(int i:dir){
                 int a=cur.x;
                 int b=cur.y;
                 
                 if(a+i>=0&&b>=0&&a+i<m&&b<n&&!vis[a+i][b]&&maze[a+i][b]!='+'){
                     vis[a+i][b]=true;
                    q.add(new Pair(a+i,b,cur.dis+1)); 
                 }
                 if(a>=0&&b+i>=0&&a<m&&b+i<n&&(!vis[a][b+i])&&maze[a][b+i]!='+'){
                     vis[a][b+i]=true;
                    q.add(new Pair(a,(b+i),cur.dis+1)); 
                 }
             }
       }
       return -1;
    }
}

class Pair{
    int x,y,dis;
    Pair(int x,int y,int dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
}
