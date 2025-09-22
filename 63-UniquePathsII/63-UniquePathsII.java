// Last updated: 22/9/2025, 8:57:07 pm
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Check if first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) firstRowHasZero = true;
        }

        // Check if first column has zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) firstColHasZero = true;
        }

        // Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // mark row
                    matrix[0][j] = 0;  // mark column
                }
            }
        }

        // Set zeros based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero if needed
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }

        // Set first column to zero if needed
        if (firstColHasZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}
