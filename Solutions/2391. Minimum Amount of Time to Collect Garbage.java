// https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
       Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("G"))map.put("G",i);
            if(garbage[i].contains("M"))map.put("M",i);
            if(garbage[i].contains("P"))map.put("P",i);
        }
        int g=0;
        for(int i=0;i<garbage.length;i++){
            if(map.containsKey("G")){
                if(i>0)g+=travel[i-1];
                g+=garbage[i].length()-garbage[i].replace("G","").length();
              if(map.get("G")==i)map.remove("G");
            }
            if(map.containsKey("M")){
               if(i>0) g+=travel[i-1];
               g+=garbage[i].length()-garbage[i].replace("M","").length();
            if(map.get("M")==i)map.remove("M");
            }
            if(map.containsKey("P")){
                if(i>0)g+=travel[i-1];
                g+=garbage[i].length()-garbage[i].replace("P","").length();
            if(map.get("P")==i)map.remove("P");
            }

        }
        return g;
    }
}
