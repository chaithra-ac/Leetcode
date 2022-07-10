// https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/
// apprach 1
class Solution {
    public int fillCups(int[] nums) {
        int c=0;
         Arrays.sort(nums);
     while(nums[2]!=0){
         if(nums[1]!=0){
            --nums[1];--nums[2];
             ++c;
         }
         else
            return c+=nums[2];
            Arrays.sort(nums);
         
     }
        return c;
    }
}

// removed sorting each time by priority queue
class Solution {
    public int fillCups(int[] nums) {
        int c=0,a=0,b=0;
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
         for(int i:nums)
             q.add(i);
        while(q.peek()!=0){
            a=q.remove();
            b=q.remove();
            if(b!=0){
                q.add(a-1);
                q.add(b-1);
                c++;
            }
            else return c+a;
        }
        return c;
    }
}
