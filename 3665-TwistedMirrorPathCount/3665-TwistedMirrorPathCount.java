// Last updated: 31/10/2026, 11:24:50 pm
1
2class Solution {
3    public int uniquePaths(int[][] grid) {
4        final int MOD = 1000000007;
5        int m = grid.length, n = grid[0].length;
6
7        long[][] f = new long[n][2];
8        f[0][0] = 1;
9
10        for (int i = 0; i < m; i++) {
11            for (int j = 0; j < n; j++) {
12                if (i > 0) {
13                    if (grid[i - 1][j] == 0) {
14                        f[j][0] = (f[j][0] + f[j][1]) % MOD;
15                    } else {
16                        f[j][0] = f[j][1];
17                    }
18                }
19
20                if (j > 0) {
21                    if (grid[i][j - 1] == 0) {
22                        f[j][1] = (f[j - 1][0] + f[j - 1][1]) % MOD;
23                    } else {
24                        f[j][1] = f[j - 1][0];
25                    }
26                }
27            }
28        }
29
30        return (int)((f[n - 1][0] + f[n - 1][1]) % MOD);
31    }
32}