// Last updated: 9/8/2026, 9:11:06 pm
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        long sum = 0;
5        long ans = 0;
6        int l = 0;
7        for (int r = 0; r < nums.length; r++) {
8            while (set.contains(nums[r])) {
9                set.remove(nums[l]);
10                sum -= nums[l];
11                l++;
12            }
13            set.add(nums[r]);
14            sum += nums[r];
15            if (r - l + 1 == k) {
16                ans = Math.max(ans, sum);
17                set.remove(nums[l]);
18                sum -= nums[l];
19                l++;
20            }
21        }
22        return ans;
23    }
24}