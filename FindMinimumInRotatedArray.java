class Solution {
    public int findMin(int[] nums) {
       int s=0,e=nums.length-1,mid=0;
            while(s<e){
                    mid=s+(e-s)/2;
                    if(nums[s]<=nums[mid]&&nums[mid]>=nums[e])
                            s=mid+1;
                    else 
                            e=mid;
            }
            return nums[e];
    }
}
