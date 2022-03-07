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
import java.math.BigInteger;
class Solution {
   static ListNode ad(int ch){
        ListNode newnode=new ListNode();
        newnode.val=ch-48;
        newnode.next=null;
        return newnode;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1="",s2="";
     while(l1!=null){
         s1=l1.val+s1;
         l1=l1.next;
     }  
        while(l2!=null){
         s2=l2.val+s2;
         l2=l2.next;
     }
        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        String t=""+a.add(b);
        System.out.print(s1+" "+s2+" "+t);
        ListNode head=null;
        head=ad(t.charAt(t.length()-1));
        ListNode cur=head;
        
        for(int i=t.length()-2;i>=0;i--){
            cur.next=ad(t.charAt(i));
            cur=cur.next;
        }
        
                return head;
    }
}
