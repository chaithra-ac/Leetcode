/*
https://leetcode.com/problems/shuffle-an-array/
*/
class Solution {
    int[]n;
    int[]a;
    int j=0;
        private Random rand = new Random();

    public Solution(int[] nums) {
        n=new int[nums.length];
        a=new int[nums.length];
        for(int i:nums){
            n[j]=i;a[j]=i;
            j++;
    }
    }
    
    public int[] reset() {
        return a;
        
    }
        private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<Integer>();
        for (int i = 0; i < n.length; i++) {
            asList.add(n[i]);
        }
        return asList;
    }

    
        public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < n.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            n[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return n;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
