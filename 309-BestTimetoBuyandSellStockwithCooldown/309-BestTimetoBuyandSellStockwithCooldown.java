// Last updated: 18/8/2026, 7:21:03 am
1class Solution {
2
3    public int maxProfit(int[] prices) {
4        int n = prices.length;
5        int[][] dp = new int[n][2];
6        for (int i = 0; i < n; i++) {
7            dp[i][0] = -1;
8            dp[i][1] = -1;
9        }
10        return solve(0, 1, prices, dp);
11    }
12
13    public int solve(int i, int buy, int[] prices, int[][] dp) {
14
15        if (i >= prices.length) {
16            return 0;
17        }
18
19       
20        if (dp[i][buy] != -1) {
21            return dp[i][buy];
22        }
23
24        if (buy == 1) {
25            int take =  solve(i + 1, 0, prices, dp)-prices[i];
26            int notTake = solve(i + 1, 1, prices, dp);
27            dp[i][buy] = Math.max(take, notTake);
28
29        } else {
30            int sell = prices[i] + solve(i + 2, 1, prices, dp);
31            int notSell = solve(i + 1, 0, prices, dp);
32            dp[i][buy] = Math.max(sell, notSell);
33        }
34
35        return dp[i][buy];
36    }
37}