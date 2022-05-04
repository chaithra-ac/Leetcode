//https://leetcode.com/problems/max-number-of-k-sum-pairs/
class Solution {
    public int maxOperations(int[] nums, int k) {
        int a=0,res=0;
       HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           a=k-nums[i];
            if(map.containsKey(a)&&map.get(a)>0){
                res++;
                map.put(a,map.get(a)-1);
            }
            else
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // System.out.println(map.size());
        }
     return res;   
    }
}
