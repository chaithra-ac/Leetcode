// https://leetcode.com/problems/partition-list/
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
    public ListNode partition(ListNode head, int x) {
    ListNode dummyl=new ListNode(0);
    ListNode less=dummyl;
    ListNode dummyg=new ListNode(0);
    ListNode great=dummyg;
       while(head!=null){
           if(head.val<x){
               dummyl.next=head;
               dummyl=dummyl.next;
           }
           else{
               dummyg.next=head;
              dummyg=dummyg.next;
               }
               head=head.next;
       }
        dummyg.next=null;
        dummyl.next=great.next;
        return less.next;
    }
}
