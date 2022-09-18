// https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
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
    public TreeNode reverseOddLevels(TreeNode root) {
       compute(root.left,root.right,0);
        return root;
    }
    void compute(TreeNode root1,TreeNode root2,int l){
        if(root1==null||root2==null)return;
        if(l%2==0){
            int temp=root1.val;
            root1.val=root2.val;
            root2.val=temp;
        }
        compute(root1.left,root2.right,l+1);
        compute(root1.right,root2.left,l+1);
    }
}
