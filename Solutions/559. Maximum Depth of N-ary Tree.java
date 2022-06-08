//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Pair{
    Node node;
    int d;
        public List<Node> children;
    public Pair(Node node,int d){
        this.d=d;
        this.node=node;
    }
}
class Solution {
    int max=0;
    public int maxDepth(Node root) {
        Queue<Pair>q=new LinkedList<>();
        if(root==null)return max;
        if(root.children.size()==0)return 1;
           q.add(new Pair(root,1));
        
        while(!q.isEmpty()){
            Pair node=q.poll();
            for(Node child:node.node.children){
                q.add(new Pair(child,node.d+1));
                if(node.d+1>max)max=node.d+1;
            }
        }
        return max;
    }
}
