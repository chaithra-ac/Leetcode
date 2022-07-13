// https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/
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
     List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        compute(root,0);
        return list;
    }
    void compute(TreeNode root,int level){
        if(root==null)return;
        if(level>=list.size())list.add(new ArrayList<>());
        list.get(level).add(root.val);
        compute(root.left,level+1);
        compute(root.right,level+1);
        return;
    }
}
