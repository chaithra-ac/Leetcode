// https://leetcode.com/problems/decode-ways/description/


class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0')
           return 0;

        int fib=0,a=1,b=0;
        for(int i=0;i<s.length();i++){
            if(i==0||Integer.parseInt(""+s.charAt(i-1)+s.charAt(i))<=26){
                if(s.charAt(i)=='0')
                    a-=fib;
                
                fib=a+b;
                b=a;
                a=fib;
            } else{
                if(i>0&&(s.charAt(i) == '0' &&
                (s.charAt(i-1)!='1'||s.charAt(i-1) != '2')))
                    return 0;
                b=fib; 
            }
            System.out.print(fib+" ");
        }
        return fib;
 
    }
}
