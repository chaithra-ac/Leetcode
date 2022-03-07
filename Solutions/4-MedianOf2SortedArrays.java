//https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
      if(n1.length==0&&n2.length==1)return n2[0];
      if(n2.length==0&&n1.length==1)return n1[0];
         
        int[]m=new int[(n1.length+n2.length)/2+1];
        int i=0,j=0,k=0;
        
        while(k<m.length&&i<n1.length&&j<n2.length){
            if(n1[i]<=n2[j])
                m[k++]=n1[i++];
            else 
                m[k++]=n2[j++];
        }
        
        while(k<m.length&&i<n1.length)
             m[k++]=n1[i++];
        
        while(k<m.length&&j<n2.length)
            m[k++]=n2[j++];
        
        return (n1.length+n2.length)%2==0?(m[m.length-1]+m[m.length-2])/(float)2:m[m.length-1];
          
    }
}
