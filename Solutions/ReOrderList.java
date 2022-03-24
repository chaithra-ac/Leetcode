//https://leetcode.com/problems/reorder-list/
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
    
       ListNode temp;
        int s=0;
    public void reorderList(ListNode head) {
        temp=head;
         head=temp;
        ListNode run=head;
        compute(run);
        
    }
    void compute(ListNode head){
        if(head==null)
            return;
        if(head!=null)s++;
        compute(head.next);
        if(s/2>0){
        ListNode node=temp.next;
        temp.next=head;
        temp=temp.next;
        temp.next=node;     
        temp=temp.next;
        s=s-2;
        }
        else temp.next=null;
    }
}
