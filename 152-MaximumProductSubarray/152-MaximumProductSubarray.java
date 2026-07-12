// Last updated: 12/7/2026, 10:22:39 am
1class Solution {
2
3    public int rob(int[] nums) {
4
5        int n = nums.length;
6
7        // Agar sirf ek hi house hai
8        if (n == 1)
9            return nums[0];
10
11        // Case 1: Last house ko ignore karo
12        int case1 = helper(nums, 0, n - 2);
13
14        // Case 2: First house ko ignore karo
15        int case2 = helper(nums, 1, n - 1);
16
17        return Math.max(case1, case2);
18    }
19
20    // House Robber I
21    public int helper(int[] nums, int start, int end) {
22
23        int prev2 = 0; // dp[i-2]
24        int prev1 = 0; // dp[i-1]
25
26        for (int i = start; i <= end; i++) {
27
28            // Current house loot karo
29            int take = nums[i] + prev2;
30
31            // Current house skip karo
32            int notTake = prev1;
33
34            // Dono me se best
35            int curr = Math.max(take, notTake);
36
37            // DP shift
38            prev2 = prev1;
39            prev1 = curr;
40        }
41
42        return prev1;
43    }
44}