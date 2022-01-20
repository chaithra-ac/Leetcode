class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int res = 0, max = Integer.MIN_VALUE;       
        int start = 1, end = 1, mid = 0;
        for (int i : piles)
            if(end<i)end=i;

        res = end;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (res < mid)
                return res;

            if (canComplete(piles, mid, h)) {
                end = mid;
                res = mid;
            } 
            else if (!canComplete(piles, mid, h))
                start = mid + 1;
        }
        return res;
    }

    boolean canComplete(int[] piles, int speed, int h) {
        int hrSpent = 0;
        for (int i : piles) {
            hrSpent += (int) Math.ceil((double) i / speed);
            if (hrSpent > h) return false;
        }
        return true;
    }
}
