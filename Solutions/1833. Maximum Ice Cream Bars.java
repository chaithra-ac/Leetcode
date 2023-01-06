// https://leetcode.com/problems/maximum-ice-cream-bars/description/
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int iceCremBars = 0;
        for (int i : costs) {
            coins -= i;
            if (coins < 0) {
                return iceCremBars;
            }
            else {
                ++iceCremBars;
            }

        }
        return coins < 0 ? -1 : iceCremBars;
    }
}
