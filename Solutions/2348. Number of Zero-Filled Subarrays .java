https://leetcode.com/problems/number-of-zero-filled-subarrays/
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,res=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
             count++; 
          }
          if(nums[i]!=0||(i==nums.length-1&&nums[i]==0)){
              res+=count*(count+1)/2;
              count=0;
          }
      }
    return res;
    }
}
