// https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/
class Solution {
	public int minCost(int[][] grid) {
		int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->a.cost-b.cost);
        
		q.add(new Pair(0, 0, 0));
        
		while (!q.isEmpty()) {
            
			Pair r = q.poll();
            
			if (r.i == grid.length - 1 && r.j == grid[0].length - 1)
				return r.cost;
            
			if (!visited[r.i][r.j]){
			visited[r.i][r.j] = true;
			for (int k = 0; k < 4; k++) {
				int i = r.i + dirs[k][0];
				int j = r.j + dirs[k][1];
				if (i >= 0 && j >= 0 && i <= grid.length - 1 && j <= grid[0].length - 1) {
					if (grid[r.i][r.j] == k + 1)
						q.add(new Pair(i, j, r.cost));
					else 
					    q.add(new Pair(i, j, r.cost + 1));
				}
			  }
            }
		}
		return -1;
	}
}
class Pair {
		int i;
		int j;
		int cost;
		public Pair(int i, int j, int cost) {
			this.i = i;
			this.j = j;
			this.cost = cost;
		}
}

