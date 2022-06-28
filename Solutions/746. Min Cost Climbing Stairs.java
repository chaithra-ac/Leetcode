// https://leetcode.com/problems/min-cost-climbing-stairs/




//dp
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length+1]; 
        int n=cost.length;
        for (int i = 2; i <= n; ++i) {
          dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
  }
  return dp[n];
    }
  }


//memoization
class Solution{
int[] dp;
public int minCostClimbingStairs(int[] cost) {
	int n = cost.length;
	dp = new int[n];
	return Math.min(minCost(cost, n-1), minCost(cost, n-2));
}
private int minCost(int[] cost, int n) {
	if (n < 0) return 0;
	if (n==0 || n==1) return cost[n];
	if (dp[n] != 0) return dp[n];
	dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
	return dp[n];
}
}



// recursion [TLE]
class Solution {
    public int minCostClimbingStairs(int[] cost) {
       return Math.min(compute(cost,cost.length-1,0),compute(cost,cost.length-2,0));
    }
    int compute(int[]cost,int n,int sum){
       	if (n < 0) return 0;
        	if (n==0 || n==1) return cost[n];
	  return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    } 
}
