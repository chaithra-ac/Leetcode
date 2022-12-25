// https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int sum = 0;
        treeMap.put(0, 0);
        for (int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
            treeMap.put(sum, i+1);
        }
        
        int n = queries.length;
        int[] result = new int[n];
        
        for (int i = 0; i<n; i++)
        {
            result[i] = treeMap.get(treeMap.floorKey(queries[i]));
        }
        
        return result;
    }
}
