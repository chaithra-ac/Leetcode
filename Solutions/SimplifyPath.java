//https://leetcode.com/problems/simplify-path/

class Solution {
    public String simplifyPath(String path) {
        String temp="";
        int i=0;
        while(i<path.length()){
            // System.out.println(temp+" "+i);
          
            if(path.charAt(i)=='/'){
               temp+='/';
               if(i+1<path.length()&&path.charAt(i+1)=='/')
                   i=removeslashes(i+1,path);
                else i++;
            }
            
            else if(path.charAt(i)=='.'){
                int count=periods(i,path);
//                 System.out.print(count);

                if(count<=0){
                  
                    int j=Math.abs(count);
                  
                    while(j<path.length()){
                        if(path.charAt(j)=='/')
                            break;
                        j++;
                    }
                  
                    temp+=path.substring(i,j);
                    i=j;
                }
                
                else if(count==1){
                    temp=temp.substring(0,temp.length()-1);
                    i++;
                }
                
                else if(count==2){
                    int j=temp.length()-1;
                    while(j>=0&&count!=0){
                        if(temp.charAt(j)=='/')
                            count--;
                        j--;
                    }
                  
                    temp=temp.length()==0?"/":temp.substring(0,j+1);
                    i+=2;
                }
                
                else{
                   temp+=path.substring(i,i+count); 
                    i=i+count;
                    }
            }
            
                else{
                    int j=i;
                    while(j<path.length()){
                    if(path.charAt(j)=='/')
                        break;
                    j++;
                    }
                    temp+=path.substring(i,j);
                    i=j;
                    }
        }
    
      return (temp.length()>1&&temp.charAt(temp.length()-1)=='/')?
              temp.substring(0,temp.length()-1):temp.length()<2?"/":temp;  
    }
  
    int removeslashes(int i,String path){
        while(i<path.length()){
            if(path.charAt(i)!='/')
                return i;
            i++;
        }
        return i;
    }
  
    int periods(int i,String path){
        int count=0;
        while(i<path.length()){
            if(path.charAt(i)!='.'&&path.charAt(i)!='/')
                return -i;
            else if(path.charAt(i)=='/')
                return count;
            count++;
            i++;       
        }
        return count;
    }
}

/* 
* .. move 1 level up
* // multiple slashes are treated as single
* . current directory
* ... more then 2 will be file/directory names
* path wont end with / but it starts with slash
*/
