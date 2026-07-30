// Last updated: 30/7/2026, 10:51:27 am
1import java.util.*;
2
3class Solution {
4    public List<List<String>> solveNQueens(int n) {
5        List<List<String>> result = new ArrayList<>();
6        char[][] board = new char[n][n];
7
8        // Initialize board with '.'
9        for (int i = 0; i < n; i++)
10            Arrays.fill(board[i], '.');
11
12        backtrack(result, board, 0, n);
13        return result;
14    }
15
16    private void backtrack(List<List<String>> result, char[][] board, int row, int n) {
17        if (row == n) {
18            result.add(construct(board));
19            return;
20        }
21
22        for (int col = 0; col < n; col++) {
23            if (isSafe(board, row, col, n)) {
24                board[row][col] = 'Q';       // Place queen
25                backtrack(result, board, row + 1, n); // Move to next row
26                board[row][col] = '.';       // Backtrack
27            }
28        }
29    }
30
31    private boolean isSafe(char[][] board, int row, int col, int n) {
32        // Check column
33        for (int i = 0; i < row; i++)
34            if (board[i][col] == 'Q') return false;
35
36        // Check upper-left diagonal
37        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
38            if (board[i][j] == 'Q') return false;
39
40        // Check upper-right diagonal
41        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
42            if (board[i][j] == 'Q') return false;
43
44        return true;
45    }
46
47    private List<String> construct(char[][] board) {
48        List<String> res = new ArrayList<>();
49        for (int i = 0; i < board.length; i++)
50            res.add(new String(board[i]));
51        return res;
52    }
53}