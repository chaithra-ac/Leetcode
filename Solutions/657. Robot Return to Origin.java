// https://leetcode.com/problems/robot-return-to-origin/

//approach 1
class Solution {
    public boolean judgeCircle(String moves) {
       HashMap<Character,ArrayList<Integer>>map=new HashMap<>();
        map.put('U',new ArrayList<Integer>(Arrays.asList(-1,0)));
        map.put('D',new ArrayList<Integer>(Arrays.asList(1,0)));
        map.put('L',new ArrayList<Integer>(Arrays.asList(0,-1)));
        map.put('R',new ArrayList<Integer>(Arrays.asList(0,1)));
                
         int i=0,j=0;       
        for(int k=0;k<moves.length();k++){
          i+=map.get(moves.charAt(k)).get(0);
          j+=map.get(moves.charAt(k)).get(1);
        }
        return i==0&&j==0;

    }
}


//approach 2
class Solution {
    public boolean judgeCircle(String moves) {
         int i=0,j=0;       
        for(int k=0;k<moves.length();k++){
          if(moves.charAt(k)=='U')i-=1;
          else if(moves.charAt(k)=='D')i+=1;
          else if(moves.charAt(k)=='L') j-=1;
          else j+=1;
              
        }
        return i==0&&j==0;

    }
}
