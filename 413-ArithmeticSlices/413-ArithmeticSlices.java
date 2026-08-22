// Last updated: 22/8/2026, 12:13:50 pm
1class Solution {
2    int[] dp;
3
4    public int fib(int n) {
5        dp = new int[n + 1];
6        Arrays.fill(dp, -1);
7
8        return solve(n);
9    }
10
11    public int solve(int n) {
12        if (n == 0) {
13            return 0;
14        }
15        if (n == 1) {
16            return 1;
17        }
18        if (dp[n] != -1) {
19            return dp[n];
20        }
21        return dp[n] = solve(n - 1) + solve(n - 2);
22    }
23}