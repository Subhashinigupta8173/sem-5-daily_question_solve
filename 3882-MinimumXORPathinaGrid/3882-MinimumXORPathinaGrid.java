// Last updated: 28/10/2026, 10:52:20 pm
1class Solution {
2    public int minCost(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        boolean[][][] dp = new boolean[m][n][1024];
5
6        dp[m-1][n-1][grid[m-1][n-1]] = true;
7
8        for (int i = m-1; i >= 0; i--) {
9            for (int j = n-1; j >= 0; j--) {
10                if (i == m-1 && j == n-1) continue;
11
12                if (i+1 < m)
13                    for (int x = 0; x < 1024; x++)
14                        if (dp[i+1][j][x])
15                            dp[i][j][x ^ grid[i][j]] = true;
16
17                if (j+1 < n)
18                    for (int x = 0; x < 1024; x++)
19                        if (dp[i][j+1][x])
20                            dp[i][j][x ^ grid[i][j]] = true;
21            }
22        }
23
24        for (int x = 0; x < 1024; x++)
25            if (dp[0][0][x]) return x;
26
27        return 0;
28    }
29}