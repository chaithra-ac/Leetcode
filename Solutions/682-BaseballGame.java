//https://leetcode.com/problems/baseball-game/
class Solution {
    public int calPoints(String[] ops) {
        int sum=0,t=0;
       ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<ops.length;i++){ 
            if(ops[i].equals("D")){
                t=list.get(list.size()-1)*2;
               list.add(t);
                sum+=t;
            }
            else if(ops[i].equals("C")){
                t=list.size()-1;
                sum-=list.get(t);
                list.remove(t);
            }
            else if(ops[i].equals("+")){
                t=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(t);
                sum+=t;
            }
            else{
                t=Integer.parseInt(ops[i]);
                 list.add(t);
                sum+=t;
            }
        }
    
        return sum;
    }
}
