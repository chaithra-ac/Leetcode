// https://leetcode.com/problems/number-of-operations-to-make-network-connected/
class Solution {
      int[]parent;
    public int makeConnected(int nodes, int[][] connections) {
        int n=connections.length;
        if(n<nodes-1)return -1;
          parent=new int[nodes];
        int extract=nodes;
        for(int i=0;i<nodes;i++)parent[i]=i;
        for(int i=0;i<n;i++){
            int x=findParent(connections[i][0]);
            int y=findParent(connections[i][1]);
            if(x!=y){
                parent[y]=x;
              --extract;
                }
            // System.out.println(Arrays.toString(parent));
        }
        return extract-1;
        
    }
    int findParent(int node){
        return (parent[node]!=node)?parent[node]=findParent(parent[node]):node;
    }
}
