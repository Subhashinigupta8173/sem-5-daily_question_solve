// Last updated: 22/9/2025, 8:08:06 pm
class Solution {
    public void solveSudoku(char[][] grid) {
        Print(grid, 0, 0);
    }

    public static boolean Print(char[][] grid, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) return true;

        if (grid[row][col] != '.') { // skip filled cells
            return Print(grid, row, col + 1);
        } else {
            for (char val = '1'; val <= '9'; val++) { // try '1' to '9'
                if (isitsafe(grid, row, col, val)) {
                    grid[row][col] = val;
                    if (Print(grid, row, col + 1)) return true;
                    grid[row][col] = '.'; // backtrack
                }
            }
        }
        return false; // no number fits
    }

    public static boolean isitsafe(char[][] grid, int row, int col, char val) {
        // check row
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == val) return false;
        }
        // check column
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == val) return false;
        }
        // check 3x3 box
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) return false;
            }
        }
        return true;
    }
}
