// Last updated: 25/10/2026, 8:01:03 pm
1import java.util.*;
2
3class Solution {
4    public int closedIsland(int[][] grid) {
5        int n = grid.length;
6        int m = grid[0].length;
7        int count = 0;
8
9        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < m; j++) {
13                if (grid[i][j] == 0) {
14                    Queue<int[]> q = new LinkedList<>();
15                    q.add(new int[]{i, j});
16                    grid[i][j] = 1;
17
18                    boolean closed = true;
19
20                    while (!q.isEmpty()) {
21                        int[] curr = q.poll();
22                        int r = curr[0];
23                        int c = curr[1];
24
25                        if (r == 0 || c == 0 || r == n - 1 || c == m - 1) {
26                            closed = false;
27                        }
28
29                        for (int[] d : dir) {
30                            int nr = r + d[0];
31                            int nc = c + d[1];
32
33                            if (nr >= 0 && nc >= 0 && nr < n && nc < m
34                                    && grid[nr][nc] == 0) {
35                                grid[nr][nc] = 1;
36                                q.add(new int[]{nr, nc});
37                            }
38                        }
39                    }
40
41                    if (closed) {
42                        count++;
43                    }
44                }
45            }
46        }
47
48        return count;
49    }
50}