https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/

class Solution {
  public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
      int n = rocks.length,i=0;
      int[]diff = new int[n];

    for (i = 0; i < n; i++)
    diff[i] = capacity[i] - rocks[i];

    Arrays.sort(diff);
    for (i = 0; i < n && (additionalRocks-=diff[i]) >= 0 ; i++){}
      
    return i;
  }
}
