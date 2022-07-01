// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

// approach 1 :[TLE] [BRUTE FORCE] initially sort and store max and its index and move all other elements other then max and count, loop it as long count gets to length!

class Solution {
    public int minMoves(int[] nums) {
      Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]==nums[n-1])return 0;
      int max,at,tmax,tat,count=0,moves=0;
        tmax=max=nums[n-1];tat=at=n-1;
        while(count!=n){
            moves++;count=0;
            for(int i=0;i<n;i++){
                if(at!=i)
                nums[i]+=1;
                
                if(nums[i]==max)
                    count++;
                
                if(max<nums[i]){
                    tmax=nums[i];
                    tat=i;
                    }
            }
           if(count==n)
            return moves;
            at=tat;
            max=tmax;
        }
        return 0;
        
    }
}

//approach 2: [TLE]move (max-min)times each time until max-min==0
class Solution {
    public int minMoves(int[] nums) {
        int count=0,moves=0,move=0,max=Integer.MIN_VALUE,tmax,tat=0,at=0,min=Integer.MAX_VALUE,n=nums.length;
    
//          get max and min with 1 traversal
        for(int i=0;i<n;i++){
            if(min>nums[i])min=nums[i];
            if(max<nums[i]){at=i;max=nums[i];}
        }
        tmax=max;tat=at;
        while(max-min>0){
            move=max-min;
            moves+=move;
            min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(at!=i)
                nums[i]+=move;
                
                if(max<nums[i]){
                    tmax=nums[i];
                    tat=i;
                }
                if(min>nums[i])min=nums[i];   
            }
            max=tmax;
            at=tat;
            // System.out.println(Arrays.toString(nums)+" "+min+" "+max+" "+at+" "+moves);
        }
        return moves;
    }
}

//approach 3: get min out of all and see how many moves are to be done to equal all, by getting difference from each element in array with min
class Solution {
    public int minMoves(int[] nums) {
        int moves=0,min=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i<n;i++)
            if(min>nums[i])min=nums[i];
            for(int i=0;i<n;i++)
               moves+=nums[i]-min;
                return moves;
    }
}
