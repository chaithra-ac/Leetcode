/*
https://leetcode.com/problems/majority-element/
*/




class Solution {
    public int majorityElement(int[] nums) {
        int res=0,count=0;
       for(int i:nums){
         if(count==0)
             res=i;
           count+=(res==i)?+1:-1;
       } 
        return res;
    }
}
