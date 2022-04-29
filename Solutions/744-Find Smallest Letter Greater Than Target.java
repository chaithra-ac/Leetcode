//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
    public char nextGreatestLetter(char[] l, char target) {
     int s=0,e=l.length,mid=0;
        while(s<e){
         mid=s+(e-s)/2;
             if(l[mid]>target)e=mid;
                else{
                   s=mid+1; 
                }
        }
        // System.out.print(l[s]+" "+l[mid]+" "+l[e]);
        return l[s%l.length];
    }
}
