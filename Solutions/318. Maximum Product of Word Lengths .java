// https://leetcode.com/problems/maximum-product-of-word-lengths/

//approach 1 :using regex[TLE]
class Solution {
    public int maxProduct(String[] words) {
        int max=0;
      for(int i=0;i<words.length;i++){
          for(int j=i+1;j<words.length;j++){
              if(words[i].matches("[^"+words[j]+"]+")){
                  // System.out.print(words[i].matches("[^"+words[j]+"]+")+" ");
                  max=Math.max(max,words[i].length()*words[j].length());
              }
          }
      }
        return max;
    }
}
