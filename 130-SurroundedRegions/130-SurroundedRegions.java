// Last updated: 28/7/2026, 8:22:13 am
1import java.util.*;
2
3class Solution {
4    public void solve(char[][] board) {
5
6        Queue<int[]> q = new LinkedList<>();
7
8        int n = board.length;
9        int m = board[0].length;
10
11        // First row and Last row
12        for (int i = 0; i < m; i++) {
13
14            // First row
15            if (board[0][i] == 'O') {
16                q.offer(new int[]{0, i});
17                board[0][i] = '#';
18            }
19
20            // Last row
21            if (board[n - 1][i] == 'O') {
22                q.offer(new int[]{n - 1, i});
23                board[n - 1][i] = '#';
24            }
25        }
26
27        // First column and Last column
28        for (int i = 0; i < n; i++) {
29
30            // First column
31            if (board[i][0] == 'O') {
32                q.offer(new int[]{i, 0});
33                board[i][0] = '#';
34            }
35
36            // Last column
37            if (board[i][m - 1] == 'O') {
38                q.offer(new int[]{i, m - 1});
39                board[i][m - 1] = '#';
40            }
41        }
42
43        // Directions
44        int[] dr = {0, 0, -1, 1};
45        int[] dc = {-1, 1, 0, 0};
46
47        // BFS
48        while (!q.isEmpty()) {
49
50            int[] curr = q.poll();
51
52            int r = curr[0];
53            int c = curr[1];
54
55            for (int i = 0; i < 4; i++) {
56
57                int nr = r + dr[i];
58                int nc = c + dc[i];
59
60                if (nr >= 0 && nr < n &&
61                    nc >= 0 && nc < m &&
62                    board[nr][nc] == 'O') {
63
64                    // Safe mark
65                    board[nr][nc] = '#';
66
67                    // Queue me daal do
68                    q.offer(new int[]{nr, nc});
69                }
70            }
71        }
72
73        // Final traversal
74        for (int i = 0; i < n; i++) {
75
76            for (int j = 0; j < m; j++) {
77
78                // Surrounded O -> X
79                if (board[i][j] == 'O') {
80                    board[i][j] = 'X';
81                }
82
83                // Safe # -> O
84                else if (board[i][j] == '#') {
85                    board[i][j] = 'O';
86                }
87            }
88        }
89    }
90}