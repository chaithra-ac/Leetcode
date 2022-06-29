// https://leetcode.com/problems/reverse-linked-list/
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
    ListNode res=new ListNode();
    ListNode dummy=res;
    public ListNode reverseList(ListNode head) {
      if(head==null)
        return null;  
      
      reverseList(head.next);
      head.next=null;
      dummy.next=head;
      dummy=dummy.next;
      // System.out.print(dummy.val);

    return res.next;
    }
}
