// https://leetcode.com/problems/path-sum-ii/
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>l=new ArrayList<>();
        compute(root,targetSum,l);
        return list;
    }
    void compute(TreeNode root,int t,List<Integer>l){
    if (root == null) return;
    l.add(root.val);
    compute(root.left,t - root.val,l);
    if (root.left == null && root.right == null && t- root.val == 0) {
        list.add(new ArrayList<Integer>(l));
    }
    compute(root.right, t-root.val, l);
    l.remove(l.size() - 1);
    }
}
