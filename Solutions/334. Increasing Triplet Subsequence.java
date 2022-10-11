// https://leetcode.com/problems/increasing-triplet-subsequence/description/

class Solution {
    public boolean increasingTriplet(int[] nums) {
       int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE;

       for(int i:nums){
           if(i<=a)a=i;
           else if(i>a&&i<=b)b=i;
           else if(i>a&&i>b&&i<=c)return true;
       }
       return false;
    }
}
