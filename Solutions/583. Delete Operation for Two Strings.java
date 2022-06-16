//https://leetcode.com/problems/delete-operation-for-two-strings/

// approach 1 recursion
class Solution {
    public int minDistance(String w1, String w2) {
        int se= compute(w1,w2,w1.length()-1,w2.length()-1);
        return w1.length()-se+w2.length()-se;
    }
    int compute(String s1,String s2,int m,int n){
        if(m<0||n<0)return 0;
        else if(s1.charAt(m)==s2.charAt(n)){
          return 1+compute(s1,s2,m-1,n-1);  
        }
        else{
            return Math.max(compute(s1,s2,m-1,n),compute(s1,s2,m,n-1));
        }
    }
    
}

//dp

public class Solution {
    public int minDistance(String w1, String w2) {
        int[][] dp = new int[w1.length() + 1][w2.length() + 1];
        for (int i = 0; i <= w1.length(); i++) {
            for (int j = 0; j <= w2.length(); j++) {
                if (i == 0 || j == 0)
                    continue;
                if (w1.charAt(i - 1) == w2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return w1.length() -dp[w1.length()][w2.length()]+w2.length()-dp[w1.length()][w2.length()];
    }
}

