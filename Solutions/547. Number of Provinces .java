//https://leetcode.com/problems/number-of-provinces/
class Solution {
    Integer parent[];
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int res=n;
        parent=new Integer[n+1];
        for(int i=1;i<n+1;i++)
            parent[i]=i;
        for(int i=0;i<n;i++){
            int u=findParent(i+1);
            for(int j=0;j<n;j++){
                if(isConnected[i][j]!=0){
                  int v=findParent(j+1);
                  if(u!=v){
                      parent[v]=u;
                      res--;
                  }
                }   
            }
            // System.out.println(Arrays.toString(parent)+"  "+Arrays.toString(rank));
        }
        return res;
      
    }
    int findParent(int node){
        return node!=parent[node]?parent[node]=findParent(parent[node]):node;
    }
}
