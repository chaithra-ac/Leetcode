// https://leetcode.com/problems/sum-of-all-subset-xor-totals/
class Solution {
    int res=0;
    public int subsetXORSum(int[] nums) {
       compute(nums,0,0); 
        return res;
    }
    void compute(int[]nums,int xor,int ind){
        if(ind>=nums.length){
            res+=xor;
            return ;
        }
        compute(nums,xor^nums[ind],ind+1);
        compute(nums,xor,ind+1);  
    }
}
