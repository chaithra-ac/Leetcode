//https://leetcode.com/problems/n-queens-ii/
class Solution {
    int count=0;
    public int totalNQueens(int n) {
           char[][]b=new char[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                b[i][j]='.';
        canPlace(0,b);
        return count;
    }
    void canPlace(int col,char[][]b){
      if(col==b.length){
        count++;
         return;
      }
      for(int i=0;i<b.length;i++){  
      if(validate(i,col,b)){
          b[i][col]='Q';
          canPlace(col+1,b);
            b[i][col]='.';

        }
     }
    }
    boolean validate(int x,int y,char[][]b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<y;j++){
        if (b[i][j] == 'Q' && (Math.abs(x - i) == Math.abs(y - j) || x == i))return false;
            }
        }
        return true;
    }
}
