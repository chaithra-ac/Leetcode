
// https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
     int size=1;
        ListNode node=head;
        while(node.next!=null){
            size++;
            node=node.next;
        }
        k=k%size;
        node.next=head;
        for(int i=0;i<size-k;i++){
            node=node.next;
        }
        head=node.next;
        node.next=null;
        return head;
    }
}
