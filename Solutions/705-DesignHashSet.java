//https://leetcode.com/problems/design-hashset/

class MyHashSet {
    int bucket=10000;
LinkedList<Integer>[]list;
    private int has_function(int key){
        return key%bucket;
    }
    public MyHashSet() {
        list=new LinkedList[bucket];
        
    }
    
    public void add(int key) {
        int i=has_function(key);
        if(list[i]==null)list[i]=new LinkedList<>();
        if(list[i].indexOf(key)==-1){
            list[i].add(key);
        }
    }
    
    public void remove(int key) {
         int i=has_function(key);
    if(list[i]==null)return;
        if(list[i].indexOf(key)!=-1){ 
            list[i].remove(list[i].indexOf(key));
        }
    }
    
    public boolean contains(int key) {
         int i=has_function(key);
    if(list[i]==null || list[i].indexOf(key)==-1)return false;
       return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
