// Last updated: 22/1/2026, 8:06:11 am
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3
4        int[] dp = new int[amount + 1];
5
6        // -2 means "not computed yet"
7        Arrays.fill(dp, -2);
8
9        return helper(coins, amount, dp);
10    }
11
12    public int helper(int[] coins, int amount, int[] dp) {
13
14        // base cases
15        if (amount == 0) return 0;
16        if (amount < 0) return -1;
17
18        if (dp[amount] != -2) {
19            return dp[amount];
20        }
21
22        int min = Integer.MAX_VALUE;
23
24        for (int coin : coins) {
25            int res = helper(coins, amount - coin, dp);
26
27            if (res >= 0) {
28                min = Math.min(min, res + 1);
29            }
30        }
31
32        dp[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
33        return dp[amount];
34    }
35}
36