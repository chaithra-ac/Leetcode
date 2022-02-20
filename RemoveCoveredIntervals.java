/*
https://leetcode.com/problems/remove-covered-intervals/
*/
class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        int i=0,res=nums.length;
     while(i<nums.length){
         for(int[]j:nums){
             if(!(nums[i][0]==j[0]&&nums[i][1]==j[1])&&nums[i][0]<=j[0]&&nums[i][1]>=j[1]){
                 // System.out.println(nums[i][0]+" "+nums[i][1]+" "+j[0]+" "+j[1]);
                 res--;
                 j[0]=j[1]=-1;
             }
         }
         // for(int[]check:nums)
             // System.out.println(check[0]+" "+check[1]);
         i++;
     }
        return res;
             
   
    }
}
