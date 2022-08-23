// https://leetcode.com/problems/letter-case-permutation/


class Solution {
    public List<String> letterCasePermutation(String s) {
        s=s.toLowerCase();
        List<String>list=new ArrayList<>();
        list.add(s);
        compute(list,s,0);
        return list;
    }
    void compute(List<String>list,String s,int ind){
     for(int i=ind;i<s.length();i++){
        if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
            char c=Character.toUpperCase(s.charAt(i));
            String temp=s.substring(0,i)+c+s.substring(i+1,s.length());
            list.add(temp);
            compute(list,temp,i+1);
        }

     }
    }
}
