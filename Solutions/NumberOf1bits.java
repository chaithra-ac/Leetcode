/*
https://leetcode.com/problems/number-of-1-bi
*/
public class Solution {
    // you need to treat n as an unsigned value
    int res=0;
    public int hammingWeight(int n) {
       for(int i=0;i<=31;i++){
         res+=n&1;
           n=n>>1;
       }
        return res;
    }
}
