//https://leetcode.com/problems/monotonic-array/

//approach 1;
class Solution {
    public boolean isMonotonic(int[] nums) {
      if(nums.length==1)return true;
        int f=0;
      for(int i=1;i<nums.length;i++){
          if(nums[i-1]<nums[i]&&f==0)f=9;
          else if(nums[i-1]>nums[i]&&f==0)f=1;
          else if(f==9&&nums[i-1]>nums[i])return false;
          else if(f==1&&nums[i-1]<nums[i])return false;
      }
        return true;
    }
}


//approach 2
class Solution {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i+1])
                increasing = false;
            if (A[i] < A[i+1])
                decreasing = false;
        }

        return increasing || decreasing;
    }
}
