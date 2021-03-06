// https://leetcode.com/problems/reverse-linked-list-ii/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      int l=0;
        while(head!=null){
            ++l;
            if(l==left){
               dummy.next=between(head,l,right);
                return res.next;
            }
            dummy.next=head;
            dummy=dummy.next;
            head=head.next;
        } 
       return res.next;
    }
    ListNode between(ListNode head,int l,int r){
      ListNode prev=rightSide(head,l,r);
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
            if(l==r)return prev; 
            ++l;
        }
        return prev;
    }
    ListNode rightSide(ListNode head,int l,int r){
        while(head!=null){
            if(l==r)return head.next;  
            head=head.next;
             ++l;
        }
        return null;
    }
}


//approch 2
public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode prev = fakeHead;
        ListNode curr = fakeHead.next;
        int i = 1;
        while (i < m) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        ListNode node = prev;
        while (i <= n) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
            i++;
        }
        node.next.next = curr;
        node.next = prev;
        return fakeHead.next;
    }
