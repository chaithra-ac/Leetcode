//https://leetcode.com/problems/arranging-coins/
class Solution {
    public int arrangeCoins(int n) {
      int s=1,i=1,r=0;
        while((n-i)>=0){
            r++;
            n-=(i++);
        }
        // System.out.println(Integer.MAX_VALUE);
        return r;
    }
}
