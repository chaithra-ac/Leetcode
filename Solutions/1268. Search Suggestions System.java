//https://leetcode.com/problems/search-suggestions-system/
class Solution {
    public List<List<String>> suggestedProducts(String[] p, String sw) {
        List<List<String>> res=new ArrayList<>();
        Arrays.sort(p);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<sw.length();i++){
            sb.append(sw.charAt(i));
            List<String>list=new ArrayList<>();
            res.add(bs(sb.toString(),p,list));
        }
      return res;  
    }
    List<String> bs(String st,String[]p,List<String>list){
           int s=0,mid=0,e=p.length,c=3;
        while(s<e){
            mid=s+(e-s)/2;
            if(p[mid].compareTo(st)>=0)e=mid;
            else s=mid+1;
        }
        for(int i=s;i<p.length;i++){
            if(c>0&&p[i].startsWith(st)){
            list.add(p[i]);c--;
            }
            else break;
        }
        return list;
    }
}
