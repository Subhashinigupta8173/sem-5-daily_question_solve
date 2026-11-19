// Last updated: 19/11/2026, 12:31:20 pm
1
2class Solution {
3    public int minimizeSum(int[] nums) {
4        Arrays.sort(nums);
5        int n = nums.length;
6        if (n <= 3) {
7            return 0;
8        }
9        int case1 = nums[n - 1] - nums[2];
10        int case2 = nums[n - 2] - nums[1];
11        int case3 = nums[n - 3] - nums[0];
12        return Math.min(case1, Math.min(case2, case3));
13    }
14}
15