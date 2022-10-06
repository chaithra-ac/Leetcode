// https://leetcode.com/problems/time-based-key-value-store/
class TimeMap {
    Map<String,LinkedList<node>>map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

     if(map.containsKey(key)){
         LinkedList<node>list=map.get(key);
         list.addFirst(new node(value,timestamp));
         map.put(key,l);
     } 
     else{
         LinkedList<node>list=new LinkedList<>();
         list.addFirst(new node(value,timestamp));
         map.put(key,list);
     }
    }
    
    public String get(String key, int timestamp) {
       if(map.containsKey(key)){

            LinkedList<node>list=map.get(key);

            for(int i=0;i<list.size();i++){
               if(list.get(i).tmstp<=timestamp)
                 return list.get(i).val;
            }
        }
    return "";
    }
}
class node{
    String val;
    int tmstp;
    node(String val,int tmstp){
        this.val=val;
        this.tmstp=tmstp;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
