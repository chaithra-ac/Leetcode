// https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles/description/

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Long count=0l;
        double[]ratio=new double[rectangles.length];
        for(int i=0;i<rectangles.length;i++)
          ratio[i]=rectangles[i][0]/(double)rectangles[i][1];
          Map<Double,Long>map=new HashMap<>();
          for(double i:ratio){
              if(!map.containsKey(i)){
                  map.put(i,1l);
              }
              else{
                count+=map.get(i);
                map.put(i,map.get(i)+1);
              }
          }

       /* for(int i=0;i<rectangles.length;i++){
            for(int j=i+1;j<rectangles.length;j++){
                if(ratio[i]==ratio[j])++count;
            }
        }*/
        return count;
    }
}
