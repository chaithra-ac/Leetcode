//https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
     long  s=1,e=num,mid=0,val=0;
        while(s<=e){
            mid=(e+s)/2;
            val=mid*mid;
            if(val==num)return true;
         else if(val<num) s=mid+1;
                else e=mid-1;
        }
       return false; 
    }
}
