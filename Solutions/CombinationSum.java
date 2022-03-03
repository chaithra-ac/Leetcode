/*
https://leetcode.com/problems/combination-sum/
*/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>l=new ArrayList();
        compute(l,new ArrayList(),candidates,target,0);
        return l;
    }
    void compute(List<List<Integer>>l,List<Integer>cur,int[]a,int t,int n){
        if(t<0||n==a.length){
            return;
        }
        if(t==0){
            l.add(new ArrayList(cur));
            return;
        }
        cur.add(a[n]);
        compute(l,cur,a,t-a[n],n);
        cur.remove(cur.size()-1);
        compute(l,cur,a,t,n+1);
        
    }
}
