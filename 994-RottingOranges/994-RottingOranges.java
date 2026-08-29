// Last updated: 29/8/2026, 12:32:50 am
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int fresh = 0;
6        Queue<int[]> q = new LinkedList<>();
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < m; j++) {
9                if (grid[i][j] == 2) {
10                    q.offer(new int[] { i, j });
11                } else if (grid[i][j] == 1) {
12                    fresh++;
13                }
14
15            }
16        }
17        int min = 0;
18        if (fresh == 0) {
19            return 0;
20        }
21        int[] dc = { -1, 1, 0, 0 };
22        int[] dr = { 0, 0, -1, 1 };
23        while (!q.isEmpty() && fresh > 0) {
24            int size = q.size();
25            for (int j = 0; j < size; j++) {
26
27                int[] top = q.poll();
28                int r = top[0];
29                int c = top[1];
30                for (int i = 0; i < 4; i++) {
31                    int nr = r + dr[i];
32                    int nc = c + dc[i];
33                    if (nr >= 0 && nc >= 0 && nc < m && nr < n && grid[nr][nc] == 1) {
34                        grid[nr][nc] = 2;
35                        fresh--;
36                        q.offer(new int[] { nr, nc });
37                    }
38                }
39            }
40            min++;
41        }
42        return fresh == 0 ? min : -1;
43
44    }
45}