//https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
      int s=0,e=nums.length,mid=0;
        while(s<e){
           mid=s+(e-s)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)
                s=mid+1;
            else e=mid;
        }
        return -1;
    }
}
