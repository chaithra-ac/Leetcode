//https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
    ListNode dummy=new ListNode();
    ListNode res=dummy;
    public ListNode mergeNodes(ListNode head) {
      head=head.next;
        int sum=0;
     while(head!=null){
         if(head.val==0&&sum!=0){
             dummy.next=new ListNode(sum);
             dummy=dummy.next;
             sum=0;
         }
         else
         sum+=head.val;
         head=head.next;
     }
        return res.next;
    }
}


//approach 2
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
    ListNode dummy=new ListNode(0);
    ListNode res=dummy;
    public ListNode mergeNodes(ListNode head) {
      head=head.next;
     while(head!=null){
         if(head.next==null)return res;
         if(head.val==0){
             dummy.next=new ListNode(0);
             dummy=dummy.next;
         }
         else
         dummy.val+=head.val;
         head=head.next;
     }
        return null;
    }
}
