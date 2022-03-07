//
class Solution {
    List<Integer>list;
    int res;
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
        for(int i=0;(nums.length-i)>=3;i++){
            list=new ArrayList<>();
            list.add(nums[i]);
            int dif=nums[i+1]-nums[i];
            compute(nums,i+1,dif);
            System.out.println(list);
    }
       return res; 
    }
    void compute(int[]nums,int cur,int dif){
        if(list.size()>=3){
           res++;
        }
        if(cur>=nums.length||nums[cur]-nums[cur-1]!=dif)
            return;
        
        list.add(nums[cur]);
            compute(nums,cur+1,dif);
        }
}
