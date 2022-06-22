//https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {
       Queue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(q.size()<k)
            q.add(nums[i]);
            else if(q.peek()<nums[i]){
                q.remove();
                q.add(nums[i]);
            }
        }
//         System.out.print(q)
        return q.poll();
    }
}
