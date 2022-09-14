// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/

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
        int countPseudoPaths=0;
    public int pseudoPalindromicPaths (TreeNode root) {
       compute(root,new HashSet<Integer>());
        return countPseudoPaths;
    }
    void compute(TreeNode root,HashSet<Integer>isPseudo){
        if(root==null)return;
        
        if(isPseudo.contains(root.val))
            isPseudo.remove(root.val);
        else 
            isPseudo.add(root.val);

        if(root.left==null&&root.right==null)
        if(isPseudo.size()<=1)
            ++countPseudoPaths;
        
        compute(root.left,isPseudo);
        compute(root.right,isPseudo);
        
        if(isPseudo.contains(root.val))
            isPseudo.remove(root.val);
         else   
             isPseudo.add(root.val);
        return;
    }
}
