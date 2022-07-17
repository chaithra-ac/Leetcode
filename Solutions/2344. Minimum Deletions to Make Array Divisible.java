// https://leetcode.com/problems/minimum-deletions-to-make-array-divisible/
class Solution {
    public int minOperations(int[] nums, int[] numsd) {
       Arrays.sort(nums);
        int del=0,isdiv=0;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                del++;
                continue;
            }
            isdiv=0;
            for(int j=0;j<numsd.length;j++){
                if(numsd[j]%nums[i]!=0){
                    isdiv=1;
                    del++;
                    break;
                }
            }
            if(isdiv==0)return del;
        }
        return isdiv==1?-1:isdiv;
    }
}
