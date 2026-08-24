// Last updated: 23/8/2026, 10:04:02 pm
1class Solution {
2    public boolean canPartitionKSubsets(int[] nums, int k) {
3        int sum = 0;
4        int n = nums.length;
5        for (int i = 0; i < n; i++) {
6            sum += nums[i];
7        }
8        if (sum % k != 0) {
9            return false;
10        }
11        int tar = sum / k;
12        boolean[] used = new boolean[n];
13        return Backtrack(0, k, tar, 0, nums, used);
14    }
15    public boolean Backtrack(int i, int k, int tar, int newsum,
16                             int[] nums, boolean[] used) {
17
18        if (k == 0) {
19            return true;
20        }
21
22        if (newsum == tar) {
23            return Backtrack(0, k - 1, tar, 0, nums, used);
24        }
25
26        for (int j = i; j < nums.length; j++) {
27
28            if (used[j] || newsum + nums[j] > tar) {
29                continue;
30            }
31
32            used[j] = true;
33
34            if (Backtrack(j + 1, k, tar,
35                          newsum + nums[j], nums, used)) {
36                return true;
37            }
38
39            used[j] = false;
40        }
41
42        return false;
43    }
44}