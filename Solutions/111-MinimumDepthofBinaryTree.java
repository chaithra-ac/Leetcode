//https://leetcode.com/problems/minimum-depth-of-binary-tree/
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
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
     compute(root,1);
        return min;
    }
   void compute(TreeNode root,int l){
       if(root==null)return;
        if(root.left==null&&root.right==null&&min>l){
            min=l;
            return;
        }
       compute(root.left,l+1);
       compute(root.right,l+1);
    }
}
