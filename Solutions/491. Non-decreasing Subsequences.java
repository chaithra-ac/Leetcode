// https://leetcode.com/problems/non-decreasing-subsequences/description/
class Solution {
    Set<List<Integer>> set = new HashSet();

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        compute(nums, 0, new ArrayList<>(), list, set);
        return list;
    }


    public void compute(int[] nums, int index, List<Integer> temp, List<List<Integer>> list, Set<List<Integer>> set) {
        if (temp.size() > 1 && set.add(new ArrayList<>(temp))) {
            list.add(new ArrayList<>(temp));
        }

        for (int i = index; i < nums.length; i++) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) <= nums[i]) {
                temp.add(nums[i]);
                compute(nums, i + 1, temp, list, set);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
