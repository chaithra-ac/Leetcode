//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int c=0;
        ArrayList<Integer>l=new ArrayList<>();
        int[]res=new int[k];
    for(int i=0;i<mat[0].length;i++){
        for (int j=0;j<mat.length;j++){
           // System.out.println(i+" "+j);
            if(l.contains(j))continue;
   
            if(mat[j][i]==0){
                res[c++]=j;
                l.add(j);
                }
            if(c==k)return res;
            }
        
        }
        for(int i=0;i<mat.length;i++){
            if(!l.contains(i)){
                res[c++]=i;
                }
            if(k==c)return res;
            }
        return res;
    }
}
