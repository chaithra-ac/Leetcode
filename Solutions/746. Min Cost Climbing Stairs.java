//https://leetcode.com/problems/min-cost-climbing-stairs/

//dp
class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.print(Arrays.toString(dp));
        return dp[n];
    }
}


//memoization
class Solution {
    int sum=0;
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
       compute(n);
        // System.out.print(Arrays.toString(dp));
        return dp[n];
    }
    int compute(int n){
       if(n==0)
           return 1;
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
        return dp[n]=compute(n-1)+compute(n-2);
    }
}



// recursion [TLE]
class Solution {
    public int climbStairs(int n) {
       return compute(n);
    }
    int compute(int n){
       if(n==0)
           return 1;
        if(n<0)return 0;
        return compute(n-1)+compute(n-2);
    }
}
