// https://leetcode.com/problems/find-closest-node-to-given-two-nodes/description/
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] dis1 = new int[edges.length];
        int[] dis2 = new int[edges.length];
        Arrays.fill(dis1, -1);
        Arrays.fill(dis2, -1);
        fromNode(node1, edges, dis1, new HashSet<Integer>(), 0);
        fromNode(node2, edges, dis2, new HashSet<>(), 0);
        int n = -1;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < edges.length; i++) {
            if (dis1[i] == -1 || dis2[i] == -1) continue;
            int maxd = Math.max(dis1[i], dis2[i]);
            if (maxd < max) {
                n = i;
                max = maxd;
            }
        }
        return n;
    }

    int fromNode(int e, int[] edges, int[] dis, HashSet<Integer> vis, int dist) {
        if (e != -1 && !vis.contains(e)) {
            vis.add(e);
            dis[e] = dist++;
            return fromNode(edges[e], edges, dis, vis, dist);
        }
        return -1;
    }
}
