// https://leetcode.com/problems/smallest-even-multiple/
class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=2;i<Integer.MAX_VALUE;i++){
            if(i%n==0&&i%2==0)return i;
        }
        return -1;
    }
}
