// https://leetcode.com/problems/add-one-row-to-tree/description/

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
       compute(root,val,depth);
       return root; 
    }
    void compute(TreeNode root,int v,int d){
        if(root==null)return;
        if(d==2){
           TreeNode templ=new TreeNode(v);
           TreeNode tempr=new TreeNode(v);
           templ.left=root.left;
           tempr.right=root.right;
           root.left=templ;
           root.right=tempr;
           return;
        }
        compute(root.left,v,d-1);
        compute(root.right,v,d-1);
    }
}
