//https://leetcode.com/problems/design-hashmap/

class MyHashMap {
    int s=100000;
   Node[]list=new Node[s];
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
    int i=getHashKey(key);
        while(list[i]!=null){
            if(list[i].key==key){
                list[i].val=value;
                return;
            }
            list[i]=list[i].next;
        }
        list[i]=new Node(key,value);    
    }
    
    public int get(int key) {
        int i=getHashKey(key);
        while(list[i]!=null){
            if(list[i].key==key){
                return list[i].val;
            }
            list[i]=list[i].next;
        }
     return -1;   
    }
    
    public void remove(int key) {
    int i=getHashKey(key);
        Node temp=list[i];
        if(list[i]!=null&&list[i].key==key){
            list[i]=temp.next;}
        else if(list[i]!=null&&list[i].next!=null){
        while(list[i].next.key!=key){
            list[i]=list[i].next;
        }
        if(list[i].next.key==key)
            list[i].next=list[i].next.next;   
        }
        
       
    }
        int getHashKey(int key){
       return key%s; 
    }
}
    class Node{
    int key;
    int val;
    Node next;
    
    Node(int key,int val){
        this.val=val;
        this.key=key;
    }
}

/**
class MyHashSet {
   Node[]list=new Node[10000];
    public MyHashSet() {
        
        
    }
    
    public void add(int key) {
       int i=getHashKey(key);
        while(list[i]!=null){
            if(list[i].val==key)
                return;
            list[i]=list[i].next;
        }
        list[i]=new Node(key);    
    }
    
    public void remove(int key) {
        int i=getHashKey(key);
        Node temp=list[i];
        if(list[i]!=null&&list[i].val==key){
            list[i]=temp.next;}
        else if(list[i]!=null&&list[i].next!=null){
        while(list[i].next.val!=key){
            list[i]=list[i].next;
        }
        if(list[i].next.val==key)
            list[i].next=list[i].next.next;   
        }
        
    }
    
    public boolean contains(int key) {
       int i=getHashKey(key);
        while(list[i]!=null){
            if(list[i].val==key)return true;
            list[i]=list[i].next;
        }
        return false;
 
    }
    int getHashKey(int key){
       return key%10000; 
    }
    
}
class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val=val;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
