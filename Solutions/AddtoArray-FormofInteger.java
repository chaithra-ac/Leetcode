//https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    List<Integer>list=new ArrayList<>();
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int i=nums.length-1,a=0,c=0;
        
      while(k>0||i>=0||c>0){
          
        a=(k==0?0:k%10)+(i<0?0:nums[i]);
        list.add(0,((a+c)%10));
          c=(a+c)/10;
          i--;
          k=k/10;
      }
        return list;
    }
}
