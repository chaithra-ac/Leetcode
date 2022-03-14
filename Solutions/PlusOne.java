//https://leetcode.com/problems/plus-one/

//approach 1
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] n) {
        String s="",s1="1";
       for(int i=0;i<n.length;i++)
           s+=n[i]; 
        BigInteger a=new BigInteger(s);
        BigInteger b=new BigInteger(s1);
        String res=a.add(b)+"";
            // =Integer.parseInt(s)+1+"";
        System.out.print(a);
        int []r=new int[res.length()];
        for(int i=0;i<res.length();i++){
            r[i]=res.charAt(i)-48;
        }
       return r; 
    }
}

//approach 2
class Solution {
    public int[] plusOne(int[] digits) {
            int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;

    }
}
