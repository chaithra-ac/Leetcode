// https://leetcode.com/problems/linked-list-in-binary-tree/


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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
       if(root==null)return false;
        else if(root.val==head.val)
            if(search(head,root))return true;
        return isSubPath(head,root.left)||isSubPath(head,root.right);
        }
    boolean search(ListNode head, TreeNode root) {
     if(head==null)return true;
        else if(root==null||root.val!=head.val)return false;
        return search(head.next,root.left)||search(head.next,root.right);
    }
}
