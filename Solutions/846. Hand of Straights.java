// https://leetcode.com/problems/hand-of-straights/
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        
        if(hand.length%groupSize!=0) return false;
        
        Arrays.sort(hand);
        
       HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:hand)map.put(i,map.getOrDefault(i,0)+1);
       
 
        int g=hand.length/groupSize;
        for(int i=0;i<hand.length;i++){
          if(map.get(hand[i])>0){
              if(group(hand[i],map,groupSize))
                  --g; 
              else
                  return false;
          }  
        }
        return true;
    }
    boolean group(int num,HashMap<Integer,Integer>map,int s){
        int pre=num;
        while(s>0){
           if(map.containsKey(pre)&&map.get(pre)>0){
               --s;
               map.put(pre,map.get(pre)-1);
               ++pre;
           }
            else return false;
        }
        return true;
    }
}
