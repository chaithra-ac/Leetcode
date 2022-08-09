// https://leetcode.com/problems/find-the-town-judge/
class Solution {
    public int findJudge(int n, int[][] trust) {
        int pt[] = new int[n+1];
        for(int i[] : trust){
            pt[i[0]]--;
            pt[i[1]]++;  
        }
        for(int i=1;i<=n;i++)
            if(pt[i]==n-1) return i;
        return -1;
        
    }
}
