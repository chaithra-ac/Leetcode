// https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
        int i=0;
        while(i<s.length()&&s.charAt(i)==' '){
            ++i;
        }
        s=s.substring(i);
       String[]arr=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
         int j=arr.length-1;
         i=0;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        
        for(int k=0;k<arr.length;k++){
           if(k>0)sb.append(" ");
            sb.append(arr[k]);
        }
        return sb.toString();
    }
}
