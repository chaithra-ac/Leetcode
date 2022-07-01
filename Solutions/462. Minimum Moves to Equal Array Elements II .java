// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
        int m=nums[n/2],res=0;
        
        for(int num:nums)res+=Math.abs(num-m);
        return res;
    }
}
