//https://leetcode.com/problems/rotate-image/

class Solution {
    int m=0,n=0;
    public void rotate(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
      for(int i=0;i<n;i++){
          for(int j=i+1;j<m;j++){
              int temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
          }
      }
       for(int i=0;i<m;i++){
         for(int j=0;j<n/2;j++){
          int tem=matrix[i][j];
             matrix[i][j]=matrix[i][n-j-1];
             matrix[i][n-j-1]=tem;
         }
       }
    }
}
