class Solution {
    public int[] searchRange(int[] nums, int t) {
        int s = 0, e = nums.length, mid = 0;
        int[] res = {-1, -1};
            
        while (s < e) {
            mid = s + (e - s) / 2;
            if (nums[mid] == t) {
                res[0] = mid;
                res[1] = mid;
                leftbs(nums, 0, mid, res, t);
                rightbs(nums, mid + 1, nums.length, res, t);
                return res;

            } else if (nums[mid] < t) s = mid + 1;
            else e = mid;
        }
            
        return res;
    }

    void leftbs(int[] nums, int s, int e, int[] res, int t) {
        int mid = 0;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (mid > 0 && nums[mid] == t && nums[mid - 1] < t ||
                    mid == 0 && nums[mid] == t) {
                res[0] = mid;
                return;
            }
            if (nums[mid] == t)
                e = mid;
            else if (nums[mid] < t)
                s = mid + 1;
        }
    }
        
    void rightbs(int[] nums, int s, int e, int[] res, int t) {
        int mid = 0, n = nums.length - 1;
        while (s < e) {
            mid = s + (e - s) / 2;
            if (mid + 1 <= n && nums[mid] == t && nums[mid + 1] > t || mid == n && nums[mid] == t) {
                res[1] = mid;
                return;
            } else if (nums[mid] == t)
                s = mid + 1;
            else if (nums[mid] > t)
                e = mid;
        }
    }

}
