// https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {   
       String[]arr=s.trim().split("\\s+");
         int j=arr.length-1,i=0;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        return String.join(" ",arr);
    }
}
