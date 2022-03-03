class Solution {
    List<List<Integer>>list=new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       compute(new ArrayList(),nums,0); 
    return list;
    }
    void compute(ArrayList<Integer>l,int[]nums,int s){
        Collections.sort(l);
        if(!list.contains(l)){
        list.add(new ArrayList(l));
        }
        for(int i=s;i<nums.length;i++){ 
            l.add(nums[i]);
            compute(l,nums,i+1);
            l.remove(l.size()-1);
        }
    }
}
