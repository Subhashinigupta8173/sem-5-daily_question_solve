// Last updated: 23/7/2026, 9:49:48 am
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3
4        int m = mat.length;
5        int n = mat[0].length;
6
7        int[][] dist = new int[m][n];
8
9        Queue<int[]> q = new LinkedList<>();
10
11        
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14
15                if (mat[i][j] == 0) {
16                    dist[i][j] = 0;
17                    q.offer(new int[]{i, j});
18                } else {
19                    dist[i][j] = -1;
20                }
21            }
22        }
23
24        int[] dr = {-1, 1, 0, 0};
25        int[] dc = {0, 0, -1, 1};
26
27        while (!q.isEmpty()) {
28
29            int[] curr = q.poll();
30
31            int row = curr[0];
32            int col = curr[1];
33
34            for (int k = 0; k < 4; k++) {
35
36                int nr = row + dr[k];
37                int nc = col + dc[k];
38
39                if (nr >= 0 && nr < m &&
40                    nc >= 0 && nc < n &&
41                    dist[nr][nc] == -1) {
42
43                    dist[nr][nc] = dist[row][col] + 1;
44
45                    q.offer(new int[]{nr, nc});
46                }
47            }
48        }
49
50        return dist;
51    }
52}