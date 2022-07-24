//https://leetcode.com/problems/equal-row-and-column-pairs/
//approach 1 
class Solution {
    public int equalPairs(int[][] grid) {
     List<ArrayList<Integer>>row=new ArrayList<>(); 
        HashMap<List<Integer>,Integer>map=new HashMap<>();
        for(int i=0;i<grid.length;i++)row.add(new ArrayList<Integer>());
        int res=0;
             for(int i=0;i<grid.length;i++){
               for(int j=0;j<grid[0].length;j++){
                   row.get(i).add(grid[i][j]);
                }
                 map.put(row.get(i),map.getOrDefault(row.get(i),0)+1);
             }
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer>col=new ArrayList<>();
            for(int j=0;j<grid.length;j++)
               col.add(grid[j][i]);
            
            if(map.containsKey(col))
               res+=map.get(col);  
        }
        return res;
    }
}


//approach 2
class Solution {
    public int equalPairs(int[][] grid) {
     List<ArrayList<Integer>>row=new ArrayList<>(); 
        for(int i=0;i<grid.length;i++)row.add(new ArrayList<Integer>());
        int k=0,res=0;
             for(int i=0;i<grid.length;i++){
               for(int j=0;j<grid[0].length;j++){
         row.get(i).add(grid[i][j]);
     }
             }
        for(int i=0;i<grid.length;i++){
         ArrayList<Integer>col=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
               col.add(grid[j][i]); 
            }
            for(ArrayList<Integer>c:row)
            if(c.equals(col))res++;
        }
        return res;
    }
}
