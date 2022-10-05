//https://leetcode.com/problems/minimum-time-to-make-rope-colorful/description/

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int[]i=new int[1];
        int res=0,temp=0;
        while(i[0]<colors.length()-1){
            if(colors.charAt(i[0])==colors.charAt(i[0]+1))
                res+=findMinimum(i,colors,neededTime,colors.charAt(i[0]));
            else 
                ++i[0];
        }
    return res;
    }
    int findMinimum(int[] s,String c,int[]nt,char col){
        int i=s[0],sum=0,max=0;
        while(i<c.length()&&col==c.charAt(i)){
              max=Math.max(max,nt[i]);
              sum+=nt[i++];   
        }
        s[0]=i;
        return sum-max;
    }
}
