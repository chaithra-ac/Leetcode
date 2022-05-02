//https://leetcode.com/problems/sort-array-by-parity/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i=0,j=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j++]=t;
            }
            i++;
        }
        return nums;
    }
}
