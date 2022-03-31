//https://leetcode.com/problems/split-array-largest-sum/

class Solution {
    public int splitArray(int[] nums, int m) {
        int minVal=0,maxSum=0;
        
        for(int i:nums){
            maxSum+=i;
            if(i>minVal)
                minVal=i;
        }
        
        
        int res=0,mid=0;
        while(minVal<=maxSum){
            mid=minVal+(maxSum-minVal)/2;
            // System.out.print(mid+" ");
            if(split(mid,nums,m)){
                res=mid;
                maxSum=mid-1;
            }
            else
                minVal=mid+1;
        }
         return res;   
    }
    boolean split(int max,int[]nums,int m){
        int i=0,subArraysCount=1,sum=0;
        
        while(i<nums.length){
           if(sum+nums[i]<=max)sum+=nums[i];
            else{
               subArraysCount++;
                sum=nums[i];
            }
            i++;
        }
                        // System.out.println("sub "+subArraysCount);
        return subArraysCount<=m;
    }
}
