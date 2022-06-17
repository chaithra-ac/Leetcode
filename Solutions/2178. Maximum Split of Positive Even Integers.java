//https://leetcode.com/problems/maximum-split-of-positive-even-integers/
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
       List<Long>res=new ArrayList<>();
        if(finalSum%2!=0)return res;
        long sum=0;
        long i=2;
        while(i<=finalSum){
            sum+=i;
            res.add(i);
            if(sum==finalSum)return res;
           if(sum>finalSum)break;
            i+=2;
        }
        res.remove(sum-finalSum);
        return res;
    }
}
