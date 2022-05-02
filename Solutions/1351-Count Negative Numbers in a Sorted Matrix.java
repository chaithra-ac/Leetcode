//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
class Solution {
    public int countNegatives(int[][] nums) {
        int s=0,e=0,mid=0,l=nums[0].length,r=0;
     for(int i=0;i<nums.length;i++){
        for(int j=0;j<l;j++){
            e=l;s=0;
                while(s<e){
                    mid=s+(e-s)/2;
                    if(nums[i][mid]>=0)s=mid+1;
                    else
                        e=mid;   
                }
        }
         r+=l-s;
     } 
        return r;
    }
}
