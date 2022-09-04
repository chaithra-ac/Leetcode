// https://leetcode.com/problems/making-file-names-unique/


class Solution {
    public String[] getFolderNames(String[] names) {
       Map<String,Integer>set=new HashMap<>();
        String[]fnames=new String[names.length];
        int ind=0,k=0;
        for(String fname:names){
           if(!set.containsKey(fname)){
               set.put(fname,1);
               fnames[ind++]=fname;
           }
           else{
              StringBuilder sb=new StringBuilder(fname);
               k=set.get(fname)-1;
               sb.append("(" + (++k) + ")");

               while(set.containsKey(sb.toString())){
                sb = new StringBuilder(fname);
					sb.append("(" + (++k) + ")");

               }
               fnames[ind++]=sb.toString();
               set.put(fname,set.getOrDefault(fname,0)+1);  
               set.put(sb.toString(),set.getOrDefault(sb.toString(),0)+1);  
           }
        }
        return fnames;
    }
}
