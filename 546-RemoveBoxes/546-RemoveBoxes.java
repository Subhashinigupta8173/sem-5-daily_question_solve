// Last updated: 27/8/2026, 11:39:09 am
1class Solution {
2    public int numMusicPlaylists(int n, int goal, int k) {
3
4        long MOD = 1000000007;
5
6
7        long[][] dp = new long[goal + 1][n + 1];
8
9    
10        dp[0][0] = 1;
11
12        for (int i = 1; i <= goal; i++) {
13
14            for (int j = 1; j <= n; j++) {
15
16                
17                dp[i][j] =
18                    dp[i - 1][j - 1] * (n - j + 1);
19
20               
21                if (j > k) {
22                    dp[i][j] +=
23                        dp[i - 1][j] * (j - k);
24                }
25
26                dp[i][j] %= MOD;
27            }
28        }
29
30        return (int) dp[goal][n];
31    }
32}