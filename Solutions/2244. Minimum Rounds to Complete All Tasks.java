// https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
class Solution {
    public int minimumRounds(int[] tasks) {
        int rounds = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer count : map.values()) {
            if(count==1) 
                return -1;
            else if (count == 2)
                rounds += 1;
            else
                rounds += count / 3 + (count % 3 == 0 ? 0 : 1);
        }
        return rounds;
    }
}
