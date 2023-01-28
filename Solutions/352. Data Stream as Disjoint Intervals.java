// https://leetcode.com/problems/data-stream-as-disjoint-intervals/description/
class SummaryRanges {
    TreeSet<Integer> set;

    public SummaryRanges() {
        set = new TreeSet<>();
    }

    public void addNum(int value) {
        set.add(value);
    }

    public int[][] getIntervals() {
        List<int[]> list = new ArrayList<>();
        int end = set.first(), start = set.first();
        for (Integer i : set) {
            if (start == i) continue;
            else if ((end + 1) == i) {
                end = i;
            } else {
                list.add(new int[]{start, end});
                start = end = i;
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[0][0]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */
