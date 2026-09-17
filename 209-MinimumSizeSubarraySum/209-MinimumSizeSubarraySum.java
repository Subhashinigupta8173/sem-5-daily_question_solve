// Last updated: 17/9/2026, 10:05:17 pm
1class Solution {
2    public int minSubArrayLen(int target, int[] arr) {
3        int min = Integer.MAX_VALUE;
4        int sum = 0;
5        int start = 0;
6
7        for (int i = 0; i < arr.length; i++) {
8            sum += arr[i];
9
10            while (sum >= target) {
11                min = Math.min(min, i - start + 1);
12                sum -= arr[start];
13                start++;
14            }
15        }
16
17        return min == Integer.MAX_VALUE ? 0 : min;
18    }
19}