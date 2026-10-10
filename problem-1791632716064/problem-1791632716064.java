// Last updated: 10/10/2026, 5:15:16 pm
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int n = nums1.length;
4        int[] diff = new int[n];
5        long total = 0;
6        int maxdiff = 0;
7        long k = (long) k1 + k2;
8
9        for (int i = 0; i < n; i++) {
10            diff[i] = Math.abs(nums1[i] - nums2[i]);
11            total += diff[i];
12            maxdiff = Math.max(maxdiff, diff[i]);
13        }
14
15        if (total <= k) {
16            return 0;
17        }
18
19        int low = 0;
20        int high = maxdiff;
21
22        while (low < high) {
23            int mid = low + (high - low) / 2;
24            long operations = 0;
25
26            for (int d : diff) {
27                operations += Math.max(0, d - mid);
28            }
29
30            if (operations <= k) {
31                high = mid;
32            } else {
33                low = mid + 1;
34            }
35        }
36
37        int t = low;
38        long remaining = k;
39
40        for (int d : diff) {
41            remaining -= Math.max(0, d - t);
42        }
43
44        long result = 0;
45
46        for (int d : diff) {
47            d = Math.min(d, t);
48
49            if (d == t && remaining > 0) {
50                d--;
51                remaining--;
52            }
53
54            result += (long) d * d;
55        }
56
57        return result;
58    }
59}