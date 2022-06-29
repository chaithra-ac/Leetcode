// https://leetcode.com/problems/middle-of-the-linked-list/
//approach 1:using count
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
    int c,t;
    ListNode res;
    public ListNode middleNode(ListNode head) {
        if(head==null)return null;
           c++;
            middleNode(head.next);
            t++;
        if(c%2!=0&&c/2+1==t||c%2==0&&c/2==t)
            res=head;
        
      return res;  
    }
}


//approach 2:using fast and slow pointer
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
    
    public ListNode middleNode(ListNode head) {
    ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
      return slow;  
    }
}
