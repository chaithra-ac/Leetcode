//https://leetcode.com/problems/n-queens/
class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>>list=new ArrayList(); 
      char[][]b=new char[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                b[i][j]='.';
        canPlace(0,b,list);
        return list;
    }
    void canPlace(int col,char[][]b,List<List<String>>list){
      if(col==b.length){
         // System.out.print("true ");
          list.add(makeList(b));
          return;
      }
      for(int i=0;i<b.length;i++){  
      if(validate(i,col,b)){
          b[i][col]='Q';
          canPlace(col+1,b,list);
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
        private List<String> makeList(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
