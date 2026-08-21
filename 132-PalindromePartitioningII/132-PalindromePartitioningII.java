// Last updated: 21/8/2026, 7:05:55 am
1import java.util.*;
2
3class Solution {
4    int[][] dp;
5    boolean[][] pal;
6
7    public int minCut(String s) {
8        int n = s.length();
9
10        dp = new int[n][n];
11        pal = new boolean[n][n];
12
13        // Precompute palindrome
14        for (int i = n - 1; i >= 0; i--) {
15            for (int j = i; j < n; j++) {
16
17                if (s.charAt(i) == s.charAt(j) &&
18                    (j - i <= 1 || pal[i + 1][j - 1])) {
19
20                    pal[i][j] = true;
21                }
22            }
23        }
24
25        for (int[] row : dp) {
26            Arrays.fill(row, -1);
27        }
28
29        return solve(0, n - 1);
30    }
31
32    public int solve(int i, int j) {
33        if (i >= j) {
34            return 0;
35        }
36        if (pal[i][j]) {
37            return 0;
38        }
39
40        if (dp[i][j] != -1) {
41            return dp[i][j];
42        }
43
44        int mn = Integer.MAX_VALUE;
45
46        for (int k = i; k < j; k++) {
47            if (pal[i][k]) {
48                int temp = 1 + solve(k + 1, j);
49                mn = Math.min(mn, temp);
50            }
51        }
52
53        return dp[i][j] = mn;
54    }
55}