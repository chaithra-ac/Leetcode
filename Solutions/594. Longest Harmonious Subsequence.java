// https://leetcode.com/problems/longest-harmonious-subsequence/

class Solution {
    public int findLHS(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int max=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=map.get(nums[i]);
            if(map.containsKey(nums[i]-1))
                max=Math.max(c+map.get(nums[i]-1),max);
            if(map.containsKey(nums[i]+1))
                max=Math.max(c+map.get(nums[i]+1),max); 
        }
        return max;
    }
}
