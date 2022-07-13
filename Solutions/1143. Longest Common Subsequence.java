// https://leetcode.com/problems/longest-common-subsequence/
//dp
class Solution {
    int dp[][];
    public int longestCommonSubsequence(String s1, String s2) {
      int n=s1.length(),n2=s2.length();
        dp=new int[n+1][n2+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n2;j++){
                if(i==0)dp[i][j]=0;
                else if(j==0)dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    
            }
        }
        return dp[n][n2];    
        }
    
   }








//approach 2:memoization
class Solution {
    int dp[][];
    public int longestCommonSubsequence(String s1, String s2) {
      int n=s1.length(),n2=s2.length();
        dp=new int[n][n2];
        return compute(s1,s2,n-1,n2-1);
    }
    int compute(String s1,String s2,int n,int m){
        if(n<0||m<0)return 0;
        if(dp[n][m]!=0)return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m))
            return dp[n][m]=1+compute(s1,s2,n-1,m-1);
        else
            return dp[n][m]=Math.max(compute(s1,s2,n,m-1),compute(s1,s2,n-1,m));
    }
}

//Approach 1:[TLE] recursion
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
      int n=s1.length(),n2=s2.length();
        return compute(s1,s2,n-1,n2-1);
    }
    int compute(String s1,String s2,int n,int m){
        if(n<0||m<0)return 0;
        if(s1.charAt(n)==s2.charAt(m))
            return 1+compute(s1,s2,n-1,m-1);
        else
            return Math.max(compute(s1,s2,n,m-1),compute(s1,s2,n-1,m));
    }
}
