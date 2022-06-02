//https://leetcode.com/problems/transpose-matrix/
class Solution {
    public int[][] transpose(int[][] m) {
     int x=m.length,y=m[0].length;   
     int[][]res=new int[y][x];
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++)
                res[j][i]=m[i][j];
        return res;
        
    }
}
