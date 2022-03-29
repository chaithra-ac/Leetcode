// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
     for(int i=0;i<nums.length;i++){
         int c=Math.abs(nums[i]);
         if(nums[c]<0)return c;
         else nums[c]*=-1;
     }
        return -1;
    }
}
