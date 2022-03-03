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
           List<Integer>l=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode r1, TreeNode r2) {
            inorder(r1);
            inorder(r2);
            Collections.sort(l);
            return l;
    }
        void inorder(TreeNode r){
                if(r==null)return;
                inorder(r.left);
                l.add(r.val);
                inorder(r.right);
        }
}
