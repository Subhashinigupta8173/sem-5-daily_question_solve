// Last updated: 8/7/2026, 11:23:28 pm
1class Solution {
2    public boolean judgeSquareSum(int c) {
3
4        for (long a = 0; a * a <= c; a++) {
5
6            long target = c - a * a;
7
8            int low = 0;
9            int high = (int)Math.sqrt(target);
10
11            while (low <= high) {
12                int mid = low + (high - low) / 2;
13                long square = 1L * mid * mid;
14
15                if (square == target) {
16                    return true;
17                } else if (square < target) {
18                    low = mid + 1;
19                } else {
20                    high = mid - 1;
21                }
22            }
23        }
24
25        return false;
26    }
27}