// Last updated: 20/11/2026, 3:39:11 pm
1
2class Solution {
3    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
4        boolean f = false;
5        int min = Integer.MAX_VALUE;
6
7        for (int i = 0; i < nums.size(); i++) {
8            int sum = 0;
9
10            for (int j = i; j < nums.size(); j++) {
11                sum += nums.get(j);
12
13                int len = j - i + 1;
14
15                if (len >= l && len <= r) {
16                    if (sum > 0) {
17                        min = Math.min(min, sum);
18                        f = true;
19                    }
20                }
21            }
22        }
23
24        if (f) {
25            return min;
26        } else {
27            return -1;
28        }
29    }
30}
31