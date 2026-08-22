// Last updated: 22/8/2026, 11:14:02 am
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int sum = 0;
4        for (int i = 0; i < nums.length; i++) {
5            sum += nums[i];
6        }
7        if (Math.abs(target) > sum) {
8            return 0;
9        }
10        if ((sum + target) % 2 != 0) {
11            return 0;
12        }
13        int s = (sum + target) / 2;
14        int[] dp = new int[s + 1];
15        dp[0] = 1;
16        for (int i = 0; i < nums.length; i++) {
17            for (int j = s; j >= nums[i]; j--) {
18                dp[j] = dp[j] + dp[j - nums[i]];
19            }
20        }
21        return dp[s];
22    }
23}