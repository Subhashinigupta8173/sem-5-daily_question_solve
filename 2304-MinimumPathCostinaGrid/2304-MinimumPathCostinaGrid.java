// Last updated: 13/8/2026, 11:16:12 am
1class Solution {
2    public int minPathCost(int[][] grid, int[][] moveCost) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[][] dp = new int[m][n];
7
8       
9        for (int j = 0; j < n; j++) {
10            dp[0][j] = grid[0][j];
11        }
12
13        
14        for (int i = 1; i < m; i++) {
15
16            for (int j = 0; j < n; j++) {
17
18                dp[i][j] = Integer.MAX_VALUE;
19
20               
21                for (int k = 0; k < n; k++) {
22
23                    int cost = dp[i - 1][k]
24                             + moveCost[grid[i - 1][k]][j]
25                             + grid[i][j];
26
27                    dp[i][j] = Math.min(dp[i][j], cost);
28                }
29            }
30        }
31
32       
33        int ans = Integer.MAX_VALUE;
34        for (int j = 0; j < n; j++) {
35            ans = Math.min(ans, dp[m - 1][j]);
36        }
37
38        return ans;
39    }
40}