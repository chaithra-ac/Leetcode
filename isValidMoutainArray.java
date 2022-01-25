class Solution {
    public boolean validMountainArray(int[] n) {
            int f=0,v=0;
     for(int i=1;i<n.length;i++){
         if(f==0&&n[i-1]<n[i]){
                 v=1;
            continue;     
         }
         else if(n[i-1]>n[i]){
                 f=1;
                continue;   
         }
             else 
                return false;
                 
     }
            return v==1&&f==1;
    }
}
