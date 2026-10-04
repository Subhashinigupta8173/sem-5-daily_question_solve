// Last updated: 4/10/2026, 3:27:08 pm
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int m = dungeon.length;
4        int n = dungeon[0].length;
5
6        int[][] dp = new int[m][n];
7
8        for (int i = 0; i < m; i++) {
9            Arrays.fill(dp[i], -1);
10        }
11        return MinimumHP(dungeon, 0, 0,dp);
12    }
13
14    public static int MinimumHP(int[][] dungeon, int i, int j,int[][] dp) {
15
16        int m = dungeon.length;
17        int n = dungeon[0].length;
18
19      
20        if (i >= m || j >= n) {
21            return Integer.MAX_VALUE;
22        }
23         if (dp[i][j] != -1) {
24            return dp[i][j];
25        }
26
27    
28        if (i == m - 1 && j == n - 1) {
29            return dp[i][j]=Math.max(1, 1 - dungeon[i][j]);
30        }
31
32        int right = MinimumHP(dungeon, i, j + 1,dp);
33        int down = MinimumHP(dungeon, i + 1, j,dp);
34
35        int min = Math.min(right, down);
36
37        return dp[i][j]= Math.max(1, min - dungeon[i][j]);
38    }
39}