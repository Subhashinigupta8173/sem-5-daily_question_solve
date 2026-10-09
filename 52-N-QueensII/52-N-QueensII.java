// Last updated: 9/10/2026, 4:44:39 pm
1
2class Solution {
3    int count = 0;
4    public int totalNQueens(int n) {
5        char[][] board = new char[n][n];
6
7        for (int i = 0; i < n; i++) {
8            Arrays.fill(board[i], '.');
9        }
10
11        solve(board, 0, n);
12        return count;
13    }
14
15    public void solve(char[][] board, int row, int n) {
16        if (row == n) {
17            count++;
18            return;
19        }
20
21        for (int col = 0; col < n; col++) {
22            if (isSafe(board, row, col, n)) {
23                board[row][col] = 'Q';
24
25                solve(board, row + 1, n);
26
27                board[row][col] = '.';
28            }
29        }
30    }
31
32    public boolean isSafe(char[][] board, int row, int col, int n) {
33        // Check same column
34        for (int i = 0; i < row; i++) {
35            if (board[i][col] == 'Q') {
36                return false;
37            }
38        }
39
40        // Check upper-left diagonal
41        for (int i = row - 1, j = col - 1;
42             i >= 0 && j >= 0; i--, j--) {
43            if (board[i][j] == 'Q') {
44                return false;
45            }
46        }
47
48        // Check upper-right diagonal
49        for (int i = row - 1, j = col + 1;
50             i >= 0 && j < n; i--, j++) {
51            if (board[i][j] == 'Q') {
52                return false;
53            }
54        }
55
56        return true;
57    }
58}