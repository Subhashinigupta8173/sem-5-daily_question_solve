// Last updated: 25/8/2026, 11:45:21 am
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4
5        if (n == 1) {
6            return nums[0];
7        }
8
9        
10        int[] dp1 = new int[n];
11        Arrays.fill(dp1, -1);
12        int case1 = findMax(nums, dp1, n - 1, 1);
13
14        int[] dp2 = new int[n];
15        Arrays.fill(dp2, -1);
16        int case2 = findMax(nums, dp2, n - 2, 0);
17
18        return Math.max(case1, case2);
19    }
20
21    public static int findMax(int[] nums, int[] dp, int i, int start) {
22
23        if (i < start) {
24            return 0;
25        }
26
27        if (i == start) {
28            return nums[i];
29        }
30
31        if (dp[i] != -1) {
32            return dp[i];
33        }
34
35        int take = nums[i] + findMax(nums, dp, i - 2, start);
36        int notTake = findMax(nums, dp, i - 1, start);
37
38        dp[i] = Math.max(take, notTake);
39
40        return dp[i];
41    }
42}