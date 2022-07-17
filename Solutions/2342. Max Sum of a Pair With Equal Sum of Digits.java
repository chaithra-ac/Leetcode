// https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/

class Solution {
    public int maximumSum(int[] nums) {
     Map<Integer,Integer>map=new HashMap<>();
    int max=-1,sum=0,n=0;
        for(int i=0;i<nums.length;i++){
        sum = 0;n=nums[i];
        while (n != 0){
            sum=sum+n%10;
            n = n/10;
        }
            if(map.containsKey(sum)){
                max=Math.max(max,nums[i]+map.get(sum));
                if(map.get(sum)<nums[i])map.put(sum,nums[i]);
            }
            else{
                map.put(sum,nums[i]);
            }
        }
        return max;   
    }
}
