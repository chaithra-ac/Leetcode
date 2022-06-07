//https://leetcode.com/problems/merge-sorted-array/

//approch 1
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=m-1,j=n-1,k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
                 while(j >= 0){
            nums1[k--] = nums2[j--];
         }         
    }
}
//approach 2
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      if(n==0)return;
      if(m==0){
        for(int i=0;i<n;i++)
            nums1[i]=nums2[i];
          return;
      }
       n=n-1;
        m=m-1;
        int t=0;
       while(n>=0){
        if(nums1[m]<=nums2[n]){
            nums1[++m]=nums2[n--];
        }
          else if(nums1[m]>nums2[n]){
              int i=m;
              while(i>=0){
                  if(nums1[i]<=nums2[n]){
                      nums1[i+1]=nums2[n--];
                      m+=1;
                      break;
                      }
                  nums1[i+1]=nums1[i];
                  nums1[i]=0;
                  if(i==0){
                      nums1[i]=nums2[n--];
                      m+=1;
                  }
                   i--;
              }
              
          }
    }
        return;
    }
}
