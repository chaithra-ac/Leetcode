// https://leetcode.com/problems/merge-k-sorted-lists/
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length>0)
            res.next=lists[0];
        for(int i=1;i<lists.length;i++)
            merge(lists[i],res);
        return res.next;
    }
   void merge(ListNode temp,ListNode res){
        while(res.next!=null&&temp!=null){
            if(temp.val<=res.next.val){
                ListNode Node=temp.next;
                temp.next=res.next;
                res.next=temp;
                temp=Node;
            }
            else res=res.next;
        }
        if(temp!=null)
            res.next=temp;
        
    }
}
