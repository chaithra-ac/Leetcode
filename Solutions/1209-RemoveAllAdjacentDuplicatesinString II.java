//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
class Pair{
    char cha;
    int c;
    
    Pair(Character cha,Integer c){
       this.cha=cha;
        this.c=c;
    }
    Pair(Integer c){
        this.c=c;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<Pair>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
                System.out.println(stack.peek().c+" "+stack.peek().cha+" "+stack.size());
                if(stack.peek().cha==s.charAt(i)){
                stack.peek().c+=1;
                    
                if(stack.peek().c==k)
                stack.pop();
            
                }
                 else
                    stack.push(new Pair(s.charAt(i),1));    
            }
                else
                    stack.push(new Pair(s.charAt(i),1));    
        }
        s="";
        while(!stack.isEmpty()){
            Pair n=stack.pop();
            int len=n.c,i=0;
            while(i<len){
               s=""+n.cha+s;
                i++; 
            }
        }
            return s;
    }
}
