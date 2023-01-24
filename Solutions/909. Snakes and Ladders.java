// https://leetcode.com/problems/snakes-and-ladders/description/
class Solution{
public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int temp[] = new int[n * n];
        int index = 0;
        for(int row = 0; row < n; row ++){ 
            if(row % 2 == 0){
                for(int i = 0; i < n; i ++)
                    temp[index++] = board[n - row - 1][i];
            }else{
                for(int i = n - 1; i >= 0; i --)
                    temp[index++] = board[n - row - 1][i];
            }
        }
        int level = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(1); 
        visited.add(1);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i ++){
                int cur = q.poll();
                if(cur == n * n)
                    return level;
                for(int j = 1; j <= 6 && cur - 1 + j < n * n; j ++){
                    int next= cur - 1 + j;
                    int nextSquare = temp[next] == -1 ? cur + j: temp[next];
                    if(!visited.contains(nextSquare)){
                        visited.add(nextSquare);
                        q.offer(nextSquare);
                    }
                }
            }
            level ++;
        }
        return -1;
    }
}
