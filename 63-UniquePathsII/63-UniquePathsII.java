// Last updated: 9/1/2026, 2:52:14 pm
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3         int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        int[][] dp = new int[m][n];
6
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                if (obstacleGrid[i][j] == 1) {
10                    dp[i][j] = 0; // obstacle
11                } else if (i == 0 && j == 0) {
12                    dp[i][j] = 1; // start
13                } else {
14                    int up = (i > 0) ? dp[i - 1][j] : 0;
15                    int left = (j > 0) ? dp[i][j - 1] : 0;
16                    dp[i][j] = up + left;
17                }
18            }
19        }
20
21        return dp[m - 1][n - 1];
22    }
23        
24    
25}