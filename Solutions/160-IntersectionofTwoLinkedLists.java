//https://leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int la=length(headA); 
       int lb=length(headB);
        while(la>lb){
            headA=headA.next;
            --la;
        }
        while(la<lb){
            headB=headB.next;
            --lb;
        }
    while(headA!=null&&headB!=null&&headA!=headB){
                    headB=headB.next;
                    headA=headA.next;
    }
    return headA;
    }
    int length(ListNode l){
        int len=0;
        while(l!=null){
            ++len;
            l=l.next;
        }
        return len;
    }
}
