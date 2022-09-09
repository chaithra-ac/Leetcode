// https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/


class Solution {
public int numberOfWeakCharacters(int[][] nums) {
    Arrays.sort(nums,(a,b)->(a[0]!=b[0])?a[0]-b[0]:b[1]-a[1]);
    Stack<Integer>stack = new Stack<>();
    stack.push(nums[0][1]);
    int c =0;
    for(int i = 1 ;i<nums.length;i++){
        while(stack.size()>0 &&  stack.peek()<nums[i][1]){
            stack.pop();
            ++c;
        }
        stack.push( nums[i][1]);
    }
    return c;
}
}

