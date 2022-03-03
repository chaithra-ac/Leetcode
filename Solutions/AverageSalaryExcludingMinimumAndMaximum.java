/*
https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
*/
class Solution {
    public double average(int[] salary) {
     int min=salary[0],max=salary[0],sum=0,f=0;
    for(int i=0;i<salary.length;i++){
        sum+=salary[i];
        min=Math.min(salary[i],min);
        max=Math.max(salary[i],max);
    }
        return (sum-min-max)/(salary.length-2.0);
    }
}
