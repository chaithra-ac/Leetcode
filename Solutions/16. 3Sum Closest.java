//https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
           int j=i+1,k=nums.length-1;
           while(j<k){
              int current=nums[i]+nums[j]+nums[k];
               if(current>target)
                    k--;
               else
                    j++;  
               if(Math.abs(current-target)<Math.abs(res-target))
                  res=current; 
           }
       }
       return res; 
    }
}
