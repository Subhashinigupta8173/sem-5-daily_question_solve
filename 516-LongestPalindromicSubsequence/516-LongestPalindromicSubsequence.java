// Last updated: 20/8/2026, 3:32:31 am
1class Solution {
2    
3    public int longestPalindromeSubseq(String s1) {
4        String s2 = new StringBuilder(s1).reverse().toString();
5        int n = s1.length();
6        int m = s2.length();
7        int[][] dp = new int[n + 1][m + 1];
8        // LCS
9        for (int i = 1; i <= n; i++) {
10            for (int j = 1; j <= m; j++) {
11                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
12                    dp[i][j] = 1 + dp[i - 1][j - 1];
13                } else {
14                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
15                }
16            }
17        }
18        return dp[n][m];
19
20    }
21}