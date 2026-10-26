// Last updated: 26/10/2026, 10:38:04 pm
1class Solution {
2    public int countIslands(int[][] grid, int k) {
3        if (grid == null || grid.length == 0 || grid[0].length == 0) {
4            return 0;
5        }
6
7        int m = grid.length;
8        int n = grid[0].length;
9        int divisibleIslandsCount = 0;
10
11        for (int r = 0; r < m; r++) {
12            for (int c = 0; c < n; c++) {
13                if (grid[r][c] > 0) {
14                    int islandRemainder = dfs(grid, r, c, m, n, k);
15                    if (islandRemainder == 0) {
16                        divisibleIslandsCount++;
17                    }
18                }
19            }
20        }
21        return divisibleIslandsCount;
22    }
23
24    private int dfs(int[][] grid, int r, int c, int m, int n, int k) {
25        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] <= 0) {
26            return 0;
27        }
28
29        int totalRemainder = grid[r][c] % k;
30        grid[r][c] = -1; 
31
32        totalRemainder = (totalRemainder + dfs(grid, r - 1, c, m, n, k)) % k; // Up
33        totalRemainder = (totalRemainder + dfs(grid, r + 1, c, m, n, k)) % k; // Down
34        totalRemainder = (totalRemainder + dfs(grid, r, c - 1, m, n, k)) % k; // Left
35        totalRemainder = (totalRemainder + dfs(grid, r, c + 1, m, n, k)) % k; // Right
36
37        return totalRemainder;
38    }
39}