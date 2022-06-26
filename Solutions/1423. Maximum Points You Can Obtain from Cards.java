//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

// approach 1:[TLE]recursion -trying all possibilities and picking max out of them.
class Solution {
    public int maxScore(int[] cardPoints, int k) {
       return compute(cardPoints,0,cardPoints.length-1,0,k); 
    }
    int compute(int[]points,int s,int e,int score,int k){
        if(k==0)return score;
        if(s>e)return 0;
        return Math.max(compute(points,s+1,e,score+points[s],k-1),compute(points,s,e-1,score+points[e],k-1));
        
    }  
}




//approach 2:[ACCEPTED] picking all left points upto k and then adding right points upto k by minusing left rightmost element of kthsum each time to maintain ksum and picking max from all of them

class Solution {
    public int maxScore(int[] points, int k) {
        int n=points.length;
       int l=points[0]; 
        for(int i=1;i<k;++i){
            l+=points[i];
        }
        int i=n-1,j=k-1,max=l;
        while(j>=0&&i>=0){
            l=l-points[j--]+points[i--];
            max=Math.max(l,max);
        }
        return max;
    }
}
