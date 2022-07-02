//https://leetcode.com/problems/maximum-units-on-a-truck/
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
  Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
    int res=0,cur=0;
    for(int box[] : boxTypes){
        cur = Math.min(truckSize, box[0]);
        res += cur * box[1];
        if((truckSize -= cur) == 0)
            return res;
    }
    return res;
  
    }
}
