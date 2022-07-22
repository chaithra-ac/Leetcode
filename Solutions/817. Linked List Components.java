// https://leetcode.com/problems/linked-list-components/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        
       HashSet<Integer>set=new HashSet<>();
        for(int i:nums)set.add(i);
        
        int count=0,f=0;
        
        while(head!=null){
            if(set.contains(head.val)&&f==0){
                count++;
                f=1;
            }
            else if(!set.contains(head.val))
                f=0;
            head=head.next;
        }
        return count;
    }
}
