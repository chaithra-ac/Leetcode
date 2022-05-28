//

//approach 1=bfs
class Solution {
    public boolean isBipartite(int[][] g) {
      int v[]=new int[g.length]; 
        for(int i=0;i<g.length;i++){
            Queue<Integer>q=new LinkedList<>();
            if(v[i]==0){
                q.add(i);
                v[i]=1;
                while(!q.isEmpty()){
                  int node=q.poll();
                    for(int adj:g[node]){
                        if(v[adj]==v[node])return false;
                        else if(v[adj]==0){
                            v[adj]=-v[node];
                            q.add(adj);  
                        }                        
                    }
                }
            }
        }
        return true;
    }
}



//approach=2
class Solution {
    public boolean isBipartite(int[][] g) {
        int[]v=new int[g.length];
       for(int i=0;i<g.length;i++){
           if(v[i]==0&&(!compute(g,v,i,1)))
               return false;
           }
        return true;
    }
    boolean compute(int[][]g,int []v,int node,int color){
        v[node]=color;
        for(int i:g[node]){
             if(v[i]==-color)
                 continue;
             if(v[i]==color||(!compute(g,v,i,-color)))
                 return false;
            
        }
        return true;
    }
}
