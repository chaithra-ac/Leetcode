/*
https://leetcode.com/problems/pascals-triangle/
*/
class Solution {
    List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> generate(int num) {
        
        for(int i=0;i<num;i++){
            
            list.add(new ArrayList());
            list.get(i).add(1);
            
            for(int j=0;j<i-1;j++)
                list.get(i).add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            
            if(i>0)list.get(i).add(1);
                        // System.out.println(list);
         } 
        return list;
     }
}
