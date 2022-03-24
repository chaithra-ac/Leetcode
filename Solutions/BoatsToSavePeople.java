//https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
     int s=people.length,n=people.length,i=0,j=n-1;
       Arrays.sort(people); 
        while(i<j){
           if(people[j]>=limit||people[i]+people[j]>limit){
               j--;
            }
            else{
                i++;
                j--;
                s--;
            }
        }
        return s;
    }
}
