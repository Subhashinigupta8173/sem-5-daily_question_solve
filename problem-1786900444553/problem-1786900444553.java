// Last updated: 16/8/2026, 10:44:04 pm
1class Solution {
2    public int change(int sum, int[] coins) {
3        int n  = coins.length;
4        int[][] dp = new int[n + 1][sum + 1];
5        
6       
7        for (int i = 0; i <= n; i++) {
8            for (int j = 0; j <= sum; j++) {
9                if( i  == 0){
10                    dp[i][j] = 0;
11                }
12                else if( j == 0){
13                     dp[i][j] = 1;
14                } 
15                
16               
17                // Take the coin if possible
18                else if (coins[i - 1] <= j) {
19
20                    dp[i][j] = 
21                            dp[i-1][j]
22                             + dp[i][j - coins[i - 1]];
23                
24                }
25                else {
26                     dp[i][j] = dp[i-1][j];
27                } 
28
29            }
30        }
31        return dp[n][sum];
32        
33    }
34}