//https://leetcode.com/problems/implement-stack-using-queues/
class MyStack {
    Deque<Integer>queue=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.push(x);
    }
    
    public int pop() {
        return queue.removeFirst();  
    }
    
    public int top() {
        return queue.getFirst();
        
    }
    
    public boolean empty() {
        return queue.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
