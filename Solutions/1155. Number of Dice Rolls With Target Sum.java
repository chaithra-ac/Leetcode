// https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/description/

// memoization[accpeted]
class Solution {
    int res=0,MOD=(int)1e9+7;
    int[][]dp;
    public int numRollsToTarget(int n, int k, int target) {
        dp=new int[target+1][n+1];
        for(int[]d:dp)Arrays.fill(d,-1);
       compute(target,n,k); 
       return res;
    }
    int compute(int tar,int n,int k){
        if(tar==0&&n==0)
            return 1;
        if(tar<0||n<0)return 0;
        res=0;
        if(dp[tar][n]!=-1)return dp[tar][n];
        for(int i=1;i<=k;i++)
            res=(res+compute(tar-i,n-1,k))%MOD;
        
        return dp[tar][n]=res;
    }
}




// recursion[tle]
class Solution {
    int res=0,MOD=(int)1e9+7;
    public int numRollsToTarget(int n, int k, int target) {
       compute(target,n,k); 
       return res;
    }
    int compute(int tar,int n,int k){
        if(tar==0&&n==0)
            return 1;
        if(tar<0||n<0)return 0;
        res=0;
        for(int i=1;i<=k;i++)
            res=(res+compute(tar-i,n-1,k))%MOD;
        
        return res;
    }
}
