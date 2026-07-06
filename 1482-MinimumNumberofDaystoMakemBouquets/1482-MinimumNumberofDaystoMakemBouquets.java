// Last updated: 6/7/2026, 10:42:19 am
1class Solution {
2
3    public int minDays(int[] bloomDay, int m, int k) {
4
5        // Total flowers hi kam hain
6        if ((long)m * k > bloomDay.length)
7            return -1;
8
9        int low = Integer.MAX_VALUE;
10        int high = Integer.MIN_VALUE;
11
12        // Minimum aur maximum bloom day nikal lo
13        for (int day : bloomDay) {
14            low = Math.min(low, day);
15            high = Math.max(high, day);
16        }
17
18        int ans = -1;
19
20        while (low <= high) {
21
22            int mid = low + (high - low) / 2;
23
24            if (canMake(bloomDay, mid, m, k)) {
25                ans = mid;
26                high = mid - 1;
27            } else {
28                low = mid + 1;
29            }
30        }
31
32        return ans;
33    }
34
35    public boolean canMake(int[] bloomDay, int day, int m, int k) {
36
37        int flowers = 0;
38        int bouquet = 0;
39
40        for (int bloom : bloomDay) {
41
42            if (bloom <= day) {
43
44                flowers++;
45
46                if (flowers == k) {
47                    bouquet++;
48                    flowers = 0;
49                }
50
51            } else {
52
53                flowers = 0;
54            }
55
56        }
57
58        return bouquet >= m;
59    }
60}