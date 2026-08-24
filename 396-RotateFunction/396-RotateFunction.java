// Last updated: 24/8/2026, 7:48:22 am
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3
4        int n = nums.length;
5
6        long sum = 0;
7        long f = 0;
8
9        // F(0) and sum
10        for (int i = 0; i < n; i++) {
11            sum += nums[i];
12            f += (long) i * nums[i];
13        }
14
15        long ans = f;
16
17      
18        for (int i = n - 1; i >= 1; i--) {
19            f = f + sum - (long) n * nums[i];
20            ans = Math.max(ans, f);
21        }
22
23        return (int) ans;
24    }
25}