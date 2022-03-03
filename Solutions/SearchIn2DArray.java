class Solution {
    public boolean searchMatrix(int[][] m, int t) {
     for(int i=0;i<m.length;i++){
             if(m[i][0]<=t&&m[i][(m[0].length)-1]>=t){
                     System.out.print(m[i][0]);
                     return bs(m,i,t);
     }
     }   
            return false;
    }
        boolean bs(int m[][],int i,int t){
                int s=0,e=m[0].length-1,mid=0;
                while(s<=e){
                        mid=s+(e-s)/2;
                        if(m[i][mid]==t)return true;
                        if(m[i][mid]<t)s=mid+1;
                        else e=mid-1;
                }
                return false;
        }
}
