// Last updated: 25/8/2026, 9:16:52 am
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5
6        Arrays.fill(dp, -1);
7
8        return findMax(n - 1, nums, dp);
9    }
10
11    public static int findMax(int i, int[] nums, int[] dp) {
12        if (i == 0) {
13            return nums[0];
14        }
15
16        if (i < 0) {
17            return 0;
18        }
19
20        if (dp[i] != -1) {
21            return dp[i];
22        }
23
24        int take = nums[i] + findMax(i - 2, nums, dp);
25        int notTake = findMax(i - 1, nums, dp);
26
27        dp[i] = Math.max(take, notTake);
28
29        return dp[i];
30    }
31}