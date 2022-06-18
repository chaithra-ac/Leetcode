// https://leetcode.com/problems/prefix-and-suffix-search/
class WordFilter {
    ArrayList<HashSet<String>>setp=new ArrayList<>();
    ArrayList<HashSet<String>>sets=new ArrayList<>();
    HashMap<String,Integer>resp=new HashMap<>();
    HashMap<String,Integer>ress=new HashMap<>();

    public WordFilter(String[] w) {

       for(int i=0;i<w.length;i++){
           setp.add(new HashSet());
           sets.add(new HashSet());
           int length=w[i].length();
           for(int j=0;j<length;j++){
               setp.get(i).add(w[i].substring(0, j + 1));
               sets.get(i).add(w[i].substring(length - 1 - j));
           }
       }
        
    }
    
    public int f(String prefix, String suffix) {
        if(resp.containsKey(prefix)&&ress.containsKey(suffix)&&
           resp.get(prefix)==ress.get(suffix))return resp.get(prefix);
        int temp=-1;
        for(int i=setp.size()-1;i>=0;i--){
            if(setp.get(i).contains(prefix)&&sets.get(i).contains(suffix))temp=i;
        }
        resp.put(prefix,temp);
        ress.put(suffix,temp);
            return temp;   
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
