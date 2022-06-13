//https://leetcode.com/problems/triangle/

//approach 1 optimized
class Solution {
    int prev,a,b;
    public int minimumTotal(List<List<Integer>> list) {
        int n=list.size(),sum=list.get(0).get(0);
        int dp[]=new int[n+1];
      for(int i=n-1;i>=0;i--){
          for(int j=0;j<list.get(i).size();j++){
               a=list.get(i).get(j);
            dp[j] = Math.min(dp[j],dp[j+1])+a;              
          }
      } 
        return dp[0];
      }
}

//approach 2(recursion)(TLE)
class Solution {
    int min=Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
       return compute(triangle,0,0,triangle.size(),0); 
        
    }
    int compute(List<List<Integer>>list,int s,int i,int n,int sum){
       if(i==n&&min>sum)
           return sum; 
        if(i>=n)
            return Integer.MAX_VALUE;
        return Math.min(compute(list,s,i+1,n,sum+list.get(i).get(s)),
                        compute(list,s+1,i+1,n,sum+list.get(i).get(s)));
        
    }
    
}
