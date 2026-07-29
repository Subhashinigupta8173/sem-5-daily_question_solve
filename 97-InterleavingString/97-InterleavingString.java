// Last updated: 29/7/2026, 10:37:50 am
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5        
6        if (m + n != s3.length()) return false;
7        
8        boolean[][] dp = new boolean[m + 1][n + 1];
9        dp[0][0] = true;
10        
11        // Fill first row
12        for (int i = 1; i <= m; i++) {
13            dp[i][0] = dp[i-1][0] && s1.charAt(i-1) == s3.charAt(i-1);
14        }
15        
16        // Fill first column
17        for (int j = 1; j <= n; j++) {
18            dp[0][j] = dp[0][j-1] && s2.charAt(j-1) == s3.charAt(j-1);
19        }
20        
21        // Fill rest of DP table
22        for (int i = 1; i <= m; i++) {
23            for (int j = 1; j <= n; j++) {
24                char c = s3.charAt(i + j - 1);
25                dp[i][j] = (dp[i-1][j] && s1.charAt(i-1) == c) ||
26                           (dp[i][j-1] && s2.charAt(j-1) == c);
27            }
28        }
29        
30        return dp[m][n];
31    }
32}