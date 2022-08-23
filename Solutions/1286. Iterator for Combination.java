// https://leetcode.com/problems/iterator-for-combination/

class CombinationIterator {
    Queue<String>queue=new LinkedList<>();
    public CombinationIterator(String characters, int k) {
      generate(characters,k,0,""); 
    }
    void generate(String s,int k,int ind,String temp){
        if(temp.length()==k)
            queue.add(temp);return;
        
        for(int i=ind;i<s.length();i++){
         temp+=s.charAt(i);
         generate(s,k,i+1,temp);
          temp=temp.substring(0,temp.length()-1);
        }
    }
    
    public String next() {
     return queue.remove(); 
        
    }
    
    public boolean hasNext() {
       return !queue.isEmpty(); 
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
