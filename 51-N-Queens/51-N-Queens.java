// Last updated: 22/9/2025, 9:21:33 pm
import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        backtrack(result, board, 0, n);
        return result;
    }

    private void backtrack(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';       // Place queen
                backtrack(result, board, row + 1, n); // Move to next row
                board[row][col] = '.';       // Backtrack
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++)
            res.add(new String(board[i]));
        return res;
    }
}
