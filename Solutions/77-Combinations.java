//https://leetcode.com/problems/combinations/

class Solution {
        List<List<Integer>>list;
    public List<List<Integer>> combine(int n, int k) {
        list=new ArrayList<>();
        compute(new ArrayList(),n,k,1);
        return list;
    }
    void compute(ArrayList<Integer>l,int n,int k,int s){
         if(l.size()==k){
            list.add(new ArrayList(l));
            return;
        }
        for(int i=s;i<=n;i++){
        l.add(i);
        compute(l,n,k,i+1);
        l.remove(l.size()-1);
        }
    }
}
