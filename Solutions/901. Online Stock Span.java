// https://leetcode.com/problems/online-stock-span/description/
class StockSpanner {
    Stack<Pair>stack;

    public StockSpanner() {
     stack=new Stack<>();   
    }
    
    public int next(int price) {
        int temp=1;
        if(stack.isEmpty()){
           stack.push(new Pair(price,1));
           return temp ;
        }
        else{
          while(!stack.isEmpty()&&stack.peek().price<=price){
            temp+=stack.peek().curSpan;
            stack.pop();
          }
          stack.push(new Pair(price,temp));
        }
        return temp;
    }
}
class Pair {

    int price;
    int curSpan;

    public Pair(int price,int curSpan){
        this.price=price;
        this.curSpan=curSpan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
