// https://leetcode.com/problems/check-if-matrix-is-x-matrix/
class Solution {
    public boolean checkXMatrix(int[][] g) {
        int op=g.length-1,n=g.length;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if((j==op||i==j)&&g[i][j]==0)return false;
              if(j!=op&&i!=j&&g[i][j]>0)return false;
          }
          op--;
      }
      return true; 
    }
}
