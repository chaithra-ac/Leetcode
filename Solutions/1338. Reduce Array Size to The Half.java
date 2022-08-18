// https://leetcode.com/problems/reduce-array-size-to-the-half/
class Solution {
    public int minSetSize(int[] arr) {
        int size=arr.length,temp=0,count=0;
      HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<size;++i)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        List<Integer>list=new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        for(int i:list){
            temp+=i;++count;
            if(size-temp<=size/2)return count;
        }
    return 0;
    }
}
