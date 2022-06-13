https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
      Arrays.sort(nums);
        int j=0,k=0,tar=0;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            j=i+1;
            k=nums.length-1;
            tar=-nums[i];
            while(j<k){
                if(nums[j]+nums[k]==tar){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k&&nums[j]==nums[j-1])j++;
                    while(j<k&&nums[k]==nums[k+1])k--;
                }
               else if(nums[j]+nums[k]>tar)k--;
                else j++;   
            }
        }
        return list;
    }
}
