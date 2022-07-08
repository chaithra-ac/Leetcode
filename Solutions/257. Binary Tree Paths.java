// https://leetcode.com/problems/binary-tree-paths/
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
    List<String>l=new ArrayList<>();
    String a="->";
    public List<String> binaryTreePaths(TreeNode root) {
        compute(root,"");
        return l;
    }
    void compute(TreeNode root,String s){
        if(root==null)return;
        s+=root.val+a;
        compute(root.left,s);
        if(root.left==null&&root.right==null){
            l.add(s.substring(0,s.length()-2));
            return;
        }
        compute(root.right,s);
    }
}
