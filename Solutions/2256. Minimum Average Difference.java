// https://leetcode.com/problems/minimum-average-difference/description/
class Solution {
    public int minimumAverageDifference(int[] nums) {

      long prefixSum=0;

      for(int num:nums)
        prefixSum+=num; 
        long sum=0,min=Integer.MAX_VALUE,n=nums.length;int atIndex=0;
      for(int i=0;i<n;i++){
          sum+=nums[i];
          prefixSum-=nums[i];
          long temp=Math.abs(sum/(i+1)-(n-i==1?0:prefixSum/(n-i-1)));
          if(temp<min){
              min=temp;
              atIndex=i;
          }
      }
       
      return atIndex;
    }
}
