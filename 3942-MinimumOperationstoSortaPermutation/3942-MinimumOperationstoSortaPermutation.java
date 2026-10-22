// Last updated: 22/10/2026, 4:59:25 pm
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length;
4        int asc = 0;
5        int desc = 0;
6
7        for (int i = 1; i < n; i++) {
8            if (nums[i] == (nums[i - 1] + 1) % n) {
9                asc++;
10            }
11            if (nums[i - 1] == (nums[i] + 1) % n) {
12                desc++;
13            }
14        }
15
16        if (asc == n - 1 && nums[0] == 0) {
17            return 0;
18        }
19
20        if (asc == n - 1) {
21            int leftrot = n - nums[0];
22            int rightrot = 1 + (nums[n - 1] + 1) + 1;
23            return Math.min(leftrot, rightrot);
24        }
25
26        if (desc == n - 1) {
27            int leftrot = n - nums[n - 1] + 1;
28            int rightrot = (nums[0] + 1) % n + 1;
29            return Math.min(leftrot, rightrot);
30        }
31
32        return -1;
33    }
34}