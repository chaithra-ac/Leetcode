https://leetcode.com/problems/smallest-string-starting-from-leaf/
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
    StringBuilder sb;
    String min = "";
    char c;
    public String smallestFromLeaf(TreeNode root) {
        if(root != null)
            searchTree(root, "");
        return min;
    }
    
    private void searchTree(TreeNode root, String path){
        if(root!=null)c=(char)(root.val+'a');
        else c=' ';
        if(root.left==null&&root.right==null){
            sb = new StringBuilder(path + c);
            sb.reverse();
            if(min == "" || sb.toString().compareTo(min) < 0){
                min = sb.toString();
                return;
            }
        }
        if(root.left != null)
            searchTree(root.left,path+c);    
        if(root.right != null)
            searchTree(root.right,path+c);
        
    }
}

    
