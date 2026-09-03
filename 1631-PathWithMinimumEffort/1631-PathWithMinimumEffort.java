// Last updated: 3/9/2026, 1:01:56 am
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3
4        int rows = heights.length;
5        int cols = heights[0].length;
6        int[][] dist = new int[rows][cols];
7
8        for (int i = 0; i < rows; i++) {
9            java.util.Arrays.fill(dist[i], Integer.MAX_VALUE);
10        }
11
12
13        java.util.PriorityQueue<int[]> pq =
14            new java.util.PriorityQueue<>(
15                (a, b) -> a[0] - b[0]
16            );
17
18        dist[0][0] = 0;
19        pq.offer(new int[]{0, 0, 0});
20
21        int[][] dirs = {
22            {-1, 0},  // up
23            {1, 0},   // down
24            {0, -1},  // left
25            {0, 1}    // right
26        };
27
28        while (!pq.isEmpty()) {
29
30            int[] curr = pq.poll();
31
32            int currEffort = curr[0];
33            int r = curr[1];
34            int c = curr[2];
35            if (r == rows - 1 && c == cols - 1) {
36                return currEffort;
37            }
38            for (int[] dir : dirs) {
39                int nr = r + dir[0];
40                int nc = c + dir[1];
41                if (nr >= 0 && nr < rows &&
42                    nc >= 0 && nc < cols) {
43                    int difference = Math.abs(
44                        heights[r][c] - heights[nr][nc]
45                    );
46                    int newEffort = Math.max(
47                        currEffort,
48                        difference
49                    );
50                    if (newEffort < dist[nr][nc]) {
51
52                        dist[nr][nc] = newEffort;
53
54                        pq.offer(new int[]{
55                            newEffort,
56                            nr,
57                            nc
58                        });
59                    }
60                }
61            }
62        }
63
64        return 0;
65    }
66}