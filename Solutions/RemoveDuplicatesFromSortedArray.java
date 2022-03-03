class Solution {
    int n;
    public int removeDuplicates(int[] nums) {
     int tracker=Integer.MIN_VALUE,flag=0,i=0;
        n=nums.length;   
    while(i<n){
      if(nums[i]!=tracker){
          flag=1;
          tracker=nums[i];
          i++;
      }
        
      else if(nums[i]==tracker&&flag==1){
            flag=0;
            i++;
            
        }
        
        else{
            move(i,nums,n);
             n--;
        }
    }
        return n;
    }
    void move(int i,int []nums,int n){
        for(int j=i;j<n;j++){
            if(j+1<n)
            nums[j]=nums[j+1];
        }
    }
}
