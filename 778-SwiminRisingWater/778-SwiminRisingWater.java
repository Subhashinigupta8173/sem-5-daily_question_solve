// Last updated: 4/9/2026, 11:43:46 pm
1class Solution {
2    public int swimInWater(int[][] grid) {
3        int n = grid.length;
4        PriorityQueue<int[]> pq =
5            new PriorityQueue<>((a, b) -> a[0] - b[0]);
6        int[][] dist = new int[n][n];
7        for (int i = 0; i < n; i++) {
8            Arrays.fill(dist[i], Integer.MAX_VALUE);
9        }
10        dist[0][0] = grid[0][0];
11        // {time, row, col}
12        pq.offer(new int[]{grid[0][0], 0, 0});
13        int[] dr = {-1, 1, 0, 0};
14        int[] dc = {0, 0, -1, 1};
15
16        while (!pq.isEmpty()) {
17
18            int[] curr = pq.poll();
19
20            int time = curr[0];
21            int r = curr[1];
22            int c = curr[2];
23
24            if (r == n - 1 && c == n - 1) {
25                return time;
26            }
27            for (int i = 0; i < 4; i++) {
28
29                int nr = r + dr[i];
30                int nc = c + dc[i];
31
32                if (nr >= 0 && nr < n &&
33                    nc >= 0 && nc < n) {
34
35                    int newTime =
36                        Math.max(time, grid[nr][nc]);
37
38                    if (newTime < dist[nr][nc]) {
39
40                        dist[nr][nc] = newTime;
41
42                        pq.offer(
43                            new int[]{newTime, nr, nc}
44                        );
45                    }
46                }
47            }
48        }
49
50        return -1;
51    }
52}