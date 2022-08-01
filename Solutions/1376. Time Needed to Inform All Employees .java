// https://leetcode.com/problems/time-needed-to-inform-all-employees/
class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
      List<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(new ArrayList<>());
        
        for(int i=0;i<manager.length;i++)
            if(manager[i]!=-1)
            list.get(manager[i]).add(i);
        
        Queue<Integer>q=new LinkedList<>();
        int time[]=new int[n];
        q.add(headID);
        int res=0,temp=0;
        while(!q.isEmpty()){
              temp=q.remove(); 
            for(Integer adj:list.get(temp)){
                    time[adj] = time[temp] + informTime[temp];
                   res=Math.max(res,time[adj]);
                    q.add(adj);
                }
            }
            // System.out.println(res+" "+temp+" "+q);
        return res;
        
    }
}


