// https://leetcode.com/problems/interleaving-string/

//approach 2 :memoization 
class Solution {
    int [][]dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        dp=new int[s1.length()][s2.length()];
        for(int[]arr:dp)
        Arrays.fill(arr,-1);
        if(s1.length()+s2.length()!=s3.length())return false;
     return compute(s1,s2,s3,s1.length()-1,s2.length()-1,s3.length()-1);   
    }
    boolean compute(String s1,String s2,String s3,int i,int j,int k){
        if(k<0||(i>=0&&s1.substring(0,i+1).equals(s3.substring(0,k+1)))||(j>=0&&s2.substring(0,j+1).equals(s3.substring(0,k+1))))
            return true;
        
        if(i>=0&&j>=0&&dp[i][j]>=0)
            return dp[i][j]==1?true:false; 
        
     boolean res=(i>=0&&j>=0&&s1.charAt(i)==s3.charAt(k)&&s2.charAt(j)==s3.charAt(k))?
            (compute(s1,s2,s3,i-1,j,k-1)||compute(s1,s2,s3,i,j-1,k-1)):
        (i>=0&&s1.charAt(i)==s3.charAt(k))?
            compute(s1,s2,s3,i-1,j,k-1):
        (j>=0&&s2.charAt(j)==s3.charAt(k))?
            compute(s1,s2,s3,i,j-1,k-1):
        false;
        if(i>=0&&j>=0)dp[i][j]=res?1:0;
        return res;
        }
}




// approach 1:[TLE] recursion
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
     return compute(s1,s2,s3,s1.length()-1,s2.length()-1,s3.length()-1);   
    }
    boolean compute(String s1,String s2,String s3,int i,int j,int k){
        if(k<0)
            return true;
        // System.out.println(i+" "+j+" "+k);
        if(i<0&&j<0)return false;
        return (i>=0&&j>=0&&s1.charAt(i)==s3.charAt(k)&&s2.charAt(j)==s3.charAt(k))?
            (compute(s1,s2,s3,i-1,j,k-1)||compute(s1,s2,s3,i,j-1,k-1)):
        (i>=0&&s1.charAt(i)==s3.charAt(k))?
            compute(s1,s2,s3,i-1,j,k-1):
        (j>=0&&s2.charAt(j)==s3.charAt(k))?
            compute(s1,s2,s3,i,j-1,k-1):
        false;
        }
}
