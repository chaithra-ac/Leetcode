// https://leetcode.com/problems/minimum-genetic-mutation/description/
class Solution {
    public int minMutation(String start, String end, String[] bank) {

        Map<String,Integer>map=new HashMap<>();
        map.put(start,0);
        Set<String>set=new HashSet<>(Arrays.asList(bank));
        Queue<String>q=new LinkedList<>();
        q.add(start);
        List<String>vis=new ArrayList<>();
        vis.add(start);
        while(!q.isEmpty()){
            String node=q.poll();
            if(map.containsKey(end))return map.get(end);
            for(String b:bank){
                int count=0;
                for(int j=0;j<b.length();j++){
                        if(b.charAt(j)!=node.charAt(j))++count;
                }
                if(count==1&&!vis.contains(b)){
                map.put(b,map.get(node)+1);
                q.add(b);
                vis.add(b);
                }
            }
        }
     return -1;
    }
}
