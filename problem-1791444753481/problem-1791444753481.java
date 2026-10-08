// Last updated: 8/10/2026, 1:02:33 pm
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        int n = nums.length;
4
5        int[] count = new int[n];
6        int[] dp = new int[n];
7
8        Arrays.fill(count, 1);
9        Arrays.fill(dp, 1);
10
11        for (int i = 0; i < n; i++) {
12            for (int j = 0; j < i; j++) {
13
14                if (nums[j] < nums[i]) {
15
16                    if (dp[j] + 1 == dp[i]) {
17                        count[i] += count[j];
18                    }
19
20                    else if (dp[j] + 1 > dp[i]) {
21                        dp[i] = dp[j] + 1;
22                        count[i] = count[j];
23                    }
24                }
25            }
26        }
27
28        int max = Integer.MIN_VALUE;
29
30        for (int i = 0; i < n; i++) {
31            max = Math.max(max, dp[i]);
32        }
33
34        int result = 0;
35
36        for (int i = 0; i < n; i++) {
37            if (dp[i] == max) {
38                result += count[i];
39            }
40        }
41
42        return result;
43    }
44}