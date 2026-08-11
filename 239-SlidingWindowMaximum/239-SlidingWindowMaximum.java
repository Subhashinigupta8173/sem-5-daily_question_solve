// Last updated: 11/8/2026, 3:54:50 am
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3
4        int n = nums.length;
5        int[] ans = new int[n - k + 1];
6
7        PriorityQueue<int[]> pq =
8            new PriorityQueue<>((a, b) -> b[0] - a[0]);
9
10        int si = 0;
11
12        for (int ei = 0; ei < n; ei++) {
13
14            // value + index
15            pq.add(new int[]{nums[ei], ei});
16
17            // window se bahar wale elements remove
18            while (pq.peek()[1] < si) {
19                pq.poll();
20            }
21
22            // window size k
23            if (ei - si + 1 == k) {
24
25                ans[si] = pq.peek()[0];
26
27                si++;
28            }
29        }
30
31        return ans;
32    }
33}