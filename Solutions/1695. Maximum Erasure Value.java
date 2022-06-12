//https://leetcode.com/problems/maximum-erasure-value/
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int[]pre=new int[nums.length];
        Map<Integer,Integer>map=new HashMap<>(); 
        
        int max=nums[0],j=-1,temp=0;
    
        for(int i=0;i<nums.length;i++){
            
            pre[i]=(i>0?pre[i-1]:0)+nums[i];
            
            if(map.containsKey(nums[i])){
                temp=map.get(nums[i]);
                if(temp>j)
                j=temp;
            }
            else if(j==-1){
                    max=pre[i];
                    map.put(nums[i],i);
                    continue;
            }
            max=Math.max(max,pre[i]-pre[j]);
            map.put(nums[i],i);
            // System.out.println(map.keySet()+" "+map.values()+" "+max);
        }        
       return max; 
    }
}
