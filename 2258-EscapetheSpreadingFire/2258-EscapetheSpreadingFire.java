// Last updated: 27/7/2026, 5:20:27 am
1import java.util.*;
2
3class Solution {
4
5    int[] dr = {-1, 1, 0, 0};
6    int[] dc = {0, 0, -1, 1};
7
8    public int maximumMinutes(int[][] grid) {
9
10        int m = grid.length;
11        int n = grid[0].length;
12
13        Queue<int[]> q = new LinkedList<>();
14
15        int[][] fireTime = new int[m][n];
16
17        for (int i = 0; i < m; i++) {
18            Arrays.fill(fireTime[i], Integer.MAX_VALUE);
19        }
20
21        // Multi-source BFS for fire
22        for (int i = 0; i < m; i++) {
23            for (int j = 0; j < n; j++) {
24
25                if (grid[i][j] == 1) {
26                    fireTime[i][j] = 0;
27                    q.offer(new int[]{i, j});
28                }
29
30            }
31        }
32
33        while (!q.isEmpty()) {
34
35            int[] curr = q.poll();
36
37            int row = curr[0];
38            int col = curr[1];
39
40            for (int i = 0; i < 4; i++) {
41
42                int nr = row + dr[i];
43                int nc = col + dc[i];
44
45                if (nr >= 0 &&
46                    nr < m &&
47                    nc >= 0 &&
48                    nc < n &&
49                    grid[nr][nc] != 2 &&
50                    fireTime[nr][nc] == Integer.MAX_VALUE) {
51
52                    fireTime[nr][nc] = fireTime[row][col] + 1;
53                    q.offer(new int[]{nr, nc});
54                }
55            }
56        }
57
58        int low = 0;
59        int high = 1000000000;
60        int ans = -1;
61
62        while (low <= high) {
63
64            int mid = low + (high - low) / 2;
65
66            if (canReach(grid, fireTime, mid)) {
67
68                ans = mid;
69                low = mid + 1;
70
71            } else {
72
73                high = mid - 1;
74            }
75        }
76
77        if (ans == 1000000000)
78            return 1000000000;
79
80        return ans;
81    }
82
83    private boolean canReach(int[][] grid, int[][] fireTime, int wait) {
84
85        int m = grid.length;
86        int n = grid[0].length;
87
88        if (wait >= fireTime[0][0]) {
89            return false;
90        }
91
92        Queue<int[]> q = new LinkedList<>();
93
94        boolean[][] vis = new boolean[m][n];
95
96        q.offer(new int[]{0, 0, wait});
97        vis[0][0] = true;
98
99        while (!q.isEmpty()) {
100
101            int[] curr = q.poll();
102
103            int r = curr[0];
104            int c = curr[1];
105            int t = curr[2];
106
107            if (r == m - 1 && c == n - 1) {
108
109                if (t <= fireTime[r][c]) {
110                    return true;
111                }
112            }
113
114            for (int i = 0; i < 4; i++) {
115
116                int nr = r + dr[i];
117                int nc = c + dc[i];
118                int nt = t + 1;
119
120                if (nr >= 0 &&
121                    nr < m &&
122                    nc >= 0 &&
123                    nc < n &&
124                    !vis[nr][nc] &&
125                    grid[nr][nc] != 2) {
126
127                    if (nr == m - 1 && nc == n - 1) {
128
129                        if (nt <= fireTime[nr][nc]) {
130
131                            vis[nr][nc] = true;
132                            q.offer(new int[]{nr, nc, nt});
133                        }
134
135                    } else {
136
137                        if (nt < fireTime[nr][nc]) {
138
139                            vis[nr][nc] = true;
140                            q.offer(new int[]{nr, nc, nt});
141                        }
142                    }
143                }
144            }
145        }
146
147        return false;
148    }
149}