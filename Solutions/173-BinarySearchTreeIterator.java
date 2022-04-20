//https://leetcode.com/problems/binary-search-tree-iterator/
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
class BSTIterator {
    Queue<Integer>list=new LinkedList<>();
    public BSTIterator(TreeNode root) {
      inorder(root); 
        // System.out.print(list);
    }
    void inorder(TreeNode root){
       if(root==null)return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int next() {
     return list.remove();   
    }
    
    public boolean hasNext() {
      return !list.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
