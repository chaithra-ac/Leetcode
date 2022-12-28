
// https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/class Solution {
  public int minStoneSum(int[] piles, int k) {
  int n = piles.length, res = 0, temp = 0;
    Queue < Integer > q=new PriorityQueue<>((a, b) -> b - a);
    
    for (int i:piles) q.add(i);

    while (!q.isEmpty() && k > 0) {
      temp = q.remove();
      q.add(temp - (temp / 2));
      --k;
    }
    while (!q.isEmpty())
      res += q.remove();

    return res;
  }
}
