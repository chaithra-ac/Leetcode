// https://leetcode.com/problems/word-search/
class Solution {
    public boolean exist(char[][] b, String w) {
        int m=b.length,n=b[0].length;
        boolean[][]vis=new boolean[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(w.charAt(0)==b[i][j]){
                   if(bfs(w,i,j,b,vis,0,m,n))
                       return true;
               }
           }      
       } 
        return false;
    }
    boolean bfs(String w,int i,int j,char[][]b,boolean[][]vis,int ind,int m,int n){
        
        if(ind>=w.length())return true;
        
        else if(i<0||j<0||i>=m||j>=n||vis[i][j]||b[i][j]!=w.charAt(ind))
            return false;
        
        vis[i][j]=true;
        
        boolean bool=bfs(w,i+1,j,b,vis,ind+1,m,n)||bfs(w,i-1,j,b,vis,ind+1,m,n)||
            bfs(w,i,j+1,b,vis,ind+1,m,n)||bfs(w,i,j-1,b,vis,ind+1,m,n);
        vis[i][j]=false;
        
    return bool;  
    }
    
}
