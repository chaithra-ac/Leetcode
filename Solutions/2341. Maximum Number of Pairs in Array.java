// https://leetcode.com/problems/maximum-number-of-pairs-in-array/


class Solution {
    public int[] numberOfPairs(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int l=0,p=0;
        for(int i:map.keySet()){
            p+=map.get(i)/2;
            l+=map.get(i)%2; 
        }
        return new int[]{p,l};
    }
}
