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
//approach 1
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    HashSet<ListNode>set=new HashSet<>();
        while(headA!=null||headB!=null){
            if(headA!=null){
            if(set.contains(headA))
                return headA;
            set.add(headA);
            headA=headA.next;
            }
            if(headB!=null){
            if(set.contains(headB))
            return headB;
            set.add(headB);
            headB=headB.next;
            }
            
        }
       return null; 
    }
}


//approach 2
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
