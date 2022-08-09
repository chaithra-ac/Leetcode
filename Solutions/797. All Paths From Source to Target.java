//https://leetcode.com/problems/all-paths-from-source-to-target/

class Solution {
      List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer>l=new ArrayList<>();
        dfs(0,graph,l);
        return list;
    }
    void dfs(int cur,int[][]g,List<Integer>l){
        l.add(cur);
        if(cur==g.length-1){
            list.add(new ArrayList(l));
            return;
        }
        for(int adj:g[cur]){
                dfs(adj,g,l);
                l.remove(l.size()-1);
        }  
    }
}
