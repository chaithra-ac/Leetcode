// https://leetcode.com/problems/design-a-number-container-system/

class NumberContainers {
TreeMap<Integer,Integer>map;
    public NumberContainers() {
    map=new TreeMap<>();
        
    }
    public void change(int index, int number) {
       map.put(index,number); 
    }
    
    public int find(int number) {
        for(int i:map.keySet())
            if(map.get(i)==number)return i;
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
