// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
class Solution {
    int max;
    public int minPartitions(String n) {
        for(int i=0;i<n.length();i++){
           max=Math.max(n.charAt(i),max);
            if(max==57)break;
        }
        return Character.getNumericValue(max);
    }
}
