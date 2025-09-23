// Last updated: 23/9/2025, 11:44:38 pm
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] = true if first i chars of s match first j chars of p
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Empty string matches empty pattern
        dp[0][0] = true;
        
        // Fill first row (s is empty)
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                // '*' can eliminate the preceding character
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                if (pc == sc || pc == '.') {
                    dp[i][j] = dp[i - 1][j - 1]; // Match current char
                } else if (pc == '*') {
                    char prev = p.charAt(j - 2);
                    // Two possibilities:
                    // 1. Treat '*' as zero occurrence of previous char
                    dp[i][j] = dp[i][j - 2];
                    // 2. Treat '*' as multiple occurrences if previous char matches
                    if (prev == sc || prev == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
}
