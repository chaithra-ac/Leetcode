// https://leetcode.com/problems/redundant-connection/

class Solution {
    int[]parent;
    public int[] findRedundantConnection(int[][] edges) {
       int n=edges.length;
        parent=new int[n+1];
        for(int i=1;i<=n;i++)parent[i]=i;
        for(int i=0;i<n;i++){
            int x=findParent(edges[i][0]);
            int y=findParent(edges[i][1]);
            if(x!=y)
                parent[y]=x;
            else return new int[]{edges[i][0],edges[i][1]};
        }
        return new int[]{};
    }
    int findParent(int n){
       return n!=parent[n]?parent[n]=findParent(parent[n]):n;
    }
}
