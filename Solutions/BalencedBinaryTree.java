//https://leetcode.com/problems/balanced-binary-tree/

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
    boolean b=true;
    public boolean isBalanced(TreeNode root) {
       if(root==null||b==false)
           return b;
           int l=maxDepth(root.left);
           int r=maxDepth(root.right);
            b=(Math.abs(l-r))<=1;

           if(b==false)
               return b;
           else{
           isBalanced(root.left);
           isBalanced(root.right);
               }
       return b;
    }
    public int maxDepth(TreeNode root) {
      if(root==null)return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}
