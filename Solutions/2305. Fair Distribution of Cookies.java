// https://leetcode.com/problems/fair-distribution-of-cookies/

class Solution {
    
    public int distributeCookies(int[] cookies, int k) {
       int[]children=new int[k];
       return maxDis(children,cookies,0);
    }
    int maxDis(int[]children,int[]cookies,int ind){
        if(ind==cookies.length){
           int res=0;
            for(int i:children)
                res=Math.max(i,res);
            return res;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<children.length;i++){
            children[i]+=cookies[ind];
            res=Math.min(res,maxDis(children,cookies,ind+1));
            children[i]-=cookies[ind];
        }
        return res;
        
    }
}
