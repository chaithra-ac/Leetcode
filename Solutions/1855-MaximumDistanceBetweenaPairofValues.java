//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/

class Solution {
        public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0, i = 0, m = nums1.length, n = nums2.length;
        for (int j = 0; j < n; ++j) {
            while (i < m && nums1[i] > nums2[j])
                i++;
            if (i == m) break;
            max = Math.max(max, j - i);
        }
        return max;
    }
}
