// Last updated: 28/7/2026, 8:23:08 am
1class Solution {
2
3    int[] dr = {-1, 1, 0, 0};
4    int[] dc = {0, 0, -1, 1};
5
6    public void solve(char[][] board) {
7
8        int n = board.length;
9        int m = board[0].length;
10
11        // First row and Last row
12        for (int j = 0; j < m; j++) {
13
14            if (board[0][j] == 'O') {
15                dfs(board, 0, j);
16            }
17
18            if (board[n - 1][j] == 'O') {
19                dfs(board, n - 1, j);
20            }
21        }
22
23        // First column and Last column
24        for (int i = 0; i < n; i++) {
25
26            if (board[i][0] == 'O') {
27                dfs(board, i, 0);
28            }
29
30            if (board[i][m - 1] == 'O') {
31                dfs(board, i, m - 1);
32            }
33        }
34
35        // Convert board
36        for (int i = 0; i < n; i++) {
37            for (int j = 0; j < m; j++) {
38
39                if (board[i][j] == 'O') {
40                    board[i][j] = 'X';
41                }
42
43                else if (board[i][j] == '#') {
44                    board[i][j] = 'O';
45                }
46            }
47        }
48    }
49
50    public void dfs(char[][] board, int r, int c) {
51
52        int n = board.length;
53        int m = board[0].length;
54
55        // Base case
56        if (r < 0 || r >= n || c < 0 || c >= m || board[r][c] != 'O') {
57            return;
58        }
59
60        // Mark as safe
61        board[r][c] = '#';
62
63        // Visit 4 directions
64        for (int i = 0; i < 4; i++) {
65            dfs(board, r + dr[i], c + dc[i]);
66        }
67    }
68}