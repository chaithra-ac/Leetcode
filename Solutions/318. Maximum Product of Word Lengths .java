// https://leetcode.com/problems/maximum-product-of-word-lengths/

// bruteforce but (*1388 ms*)[ACCEPTED]
class Solution {
public int maxProduct(String[] words) {
int max= 0,l = words.length;
Arrays.sort(words,(a,b)->b.length()-a.length());
    for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
            int f = 0;
            for(int k=0;k<words[j].length();k++){
                if(words[i].contains(""+words[j].charAt(k))){
                    f=1;break;
                }
            }
            if(f==0){
                max = Math.max(max,words[i].length()*words[j].length());
                break;
            }
        }
    }
    return max;
}
}


//approach 1 :using regex[TLE]
class Solution {
    public int maxProduct(String[] words) {
        int max=0;
      for(int i=0;i<words.length;i++){
          for(int j=i+1;j<words.length;j++){
              if(words[i].matches("[^"+words[j]+"]+")){
                  max=Math.max(max,words[i].length()*words[j].length());
              }
          }
      }
        return max;
    }
}
