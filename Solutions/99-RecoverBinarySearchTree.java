//https://leetcode.com/problems/recover-binary-search-tree/

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
    ArrayList<Integer>l=new ArrayList<>();
    int i=0,f=0;
    public void recoverTree(TreeNode root) {
        inorder(root,f);
        Collections.sort(l);
        int f=1;
        inorder(root,f);
    }
    void inorder(TreeNode root,int f){
        if(root==null)return;
        inorder(root.left,f);
        l.add(root.val);
         if(f==1){
            root.val=l.get(i);
             i++;
         }
        inorder(root.right,f);
    }
}
