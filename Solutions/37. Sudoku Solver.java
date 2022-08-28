// https://leetcode.com/problems/sudoku-solver/
class Solution {
    public void solveSudoku(char[][] b) {
        compute(b);
    }
    boolean compute(char[][]b){
        int m=b.length,n=b[0].length;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              
              if(b[i][j]=='.'){
                  
                  for(char c='1';c<='9';c++){
                     if(isValid(b,i,j,c)){
                         b[i][j]=c;
                      if(compute(b))return true;
                      else b[i][j]='.';
                  }
              }return false;
          }
      }
      }
          return true;
    }
    boolean isValid(char [][]b,int r,int c,char cur){
        for(int i=0;i<9;i++){
          if(b[i][c]==cur) return false;
          if(b[r][i]==cur) return false; 
          if(b[3*(r/3)+i/3][3*(c/3)+i%3]==cur)return false;  
        }
        return true;
    }
}
