// https://leetcode.com/problems/leaf-similar-trees/description/



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
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        compute(root1,s1);
        compute(root2,s2);
        return s1.equals(s2);   
    }
    void compute(TreeNode r,Stack<Integer> s){
        if(r==null)return;
        compute(r.left,s);
        compute(r.right,s);
        if(r!=null&&r.left==null&&r.right==null)
            s.push(r.val);        
        return;
    }
}
