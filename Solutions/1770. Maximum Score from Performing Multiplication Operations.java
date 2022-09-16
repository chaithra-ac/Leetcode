// https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
class Solution {
    int dp[][];
    public int maximumScore(int[] nums, int[] mul) {
        int n=mul.length;
        dp=new int[n+1][n+1];
        return compute(nums,mul,0,nums.length-1,0);
    }
    int compute(int[] nums, int[] mul,int s,int t,int i){
        if(i==mul.length)
            return 0;
        if(dp[s][i]!=0)
            return dp[s][i];
         dp[s][i]=Math.max(mul[i]*nums[s]+compute(nums,mul,s+1,t,i+1),
                        mul[i]*nums[t]+compute(nums,mul,s,t-1,i+1));
        return dp[s][i];
        
    }
}
