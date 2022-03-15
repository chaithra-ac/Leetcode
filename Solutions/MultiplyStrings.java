//https://leetcode.com/problems/multiply-strings/
class Solution {
    public String multiply(String num1, String num2) {
        char[] num1s = num1.toCharArray();
        char[] num2s = num2.toCharArray();
        if(num1s[0] == '0' || num2s[0] == '0') return "0";

        StringBuilder sb = new StringBuilder();
        int startPos = 0;
        int carry = 0;
        
        for(int i = num2s.length - 1; i >= 0; i--) {
            int n2 = num2s[i] - '0';
            int curPos = startPos;
            for(int j = num1s.length - 1; j >= 0;j--) {
                int n1 = num1s[j] - '0';
                if(curPos >= sb.length()) sb.append('0');
                int multiply = sb.charAt(curPos) - '0' + n1*n2;
                char digit = (char)(multiply % 10 + '0');
                sb.setCharAt(curPos, digit);
                carry = multiply /10;
                curPos++;

                if(carry > 0) {
                    if(curPos >= sb.length()) {
                        sb.append((char)(carry + '0'));
                    } else {
                        sb.setCharAt(curPos, (char)(carry + sb.charAt(curPos)));     
                    }
                }
            }
            startPos++;
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}
