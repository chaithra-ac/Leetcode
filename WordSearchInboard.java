class Solution {
    public boolean exist(char[][] b, String w) {

     for(int i=0;i<b.length;i++){
         for(int j=0;j<b[0].length;j++){
             if(b[i][j]==w.charAt(0)&&compute(i,j,b,w,0))
                 return true;
         }
     }
        return false;
    }
    boolean compute(int i,int j,char[][]b,String w,int x){
        if(x==w.length()){
            return true;
    }
        
        else if(i>=b.length||i<0||j>=b[0].length||j<0||
           w.charAt(x)!=b[i][j]||x>w.length())
            return false;
        
             b[i][j]='!';
    boolean found=compute(i+1,j,b,w,x+1)||compute(i-1,j,b,w,x+1)||compute(i,j+1,b,w,x+1)||compute(i,j-1,b,w,x+1);
             b[i][j]=w.charAt(x);
             return found;
    }
}
