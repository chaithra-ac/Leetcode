// https://leetcode.com/problems/insert-delete-getrandom-o1/description/

class RandomizedSet {
    HashSet<Integer>set;
    Random r=new Random();
    int randomIndex;
    public RandomizedSet() {
      set=new HashSet<>();  
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
      return  set.remove(val);
    }
    
    public int getRandom() {
       randomIndex=r.nextInt(set.size());
       int curIndex=0;
       for(int i:set){
           if(curIndex==randomIndex)
           return i;
           ++curIndex;
       }

       return -1 ;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
