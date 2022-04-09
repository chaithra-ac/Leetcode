//https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int top[]=new int[k];
      HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums)
            h.put(i,h.getOrDefault(i,0)+1);
        
        Queue<Integer>q=new PriorityQueue<>((a,b)->h.get(a)-h.get(b));
        for(int i:h.keySet()){
            q.add(i);
            if(q.size()>k)q.poll();
        }
        for(int i=0;i<k;i++)top[i]=q.poll();
        // System.out.print(q);
     return top;   
    }
}
