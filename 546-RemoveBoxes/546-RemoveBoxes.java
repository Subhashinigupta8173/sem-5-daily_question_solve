// Last updated: 27/8/2026, 10:57:14 am
1class Solution {
2
3    int[][][] dp;
4    int[] boxes;
5
6    public int removeBoxes(int[] boxes) {
7
8        this.boxes = boxes;
9
10        int n = boxes.length;
11
12        dp = new int[n][n][n];
13
14        return solve(0, n - 1, 0);
15    }
16
17    private int solve(int l, int r, int k) {
18
19        if (l > r) {
20            return 0;
21        }
22
23        if (dp[l][r][k] != 0) {
24            return dp[l][r][k];
25        }
26
27        int originalR = r;
28        int originalK = k;
29
30        // Last ke same boxes ko k mein add karo
31        while (l < r && boxes[r] == boxes[r - 1]) {
32            r--;
33            k++;
34        }
35
36        // Option 1: abhi remove karo
37        int ans = solve(l, r - 1, 0)
38                + (k + 1) * (k + 1);
39
40        // Option 2: same color ke saath merge karo
41        for (int m = l; m < r; m++) {
42
43            if (boxes[m] == boxes[r]) {
44
45                int score =
46                        solve(l, m, k + 1)
47                        + solve(m + 1, r - 1, 0);
48
49                ans = Math.max(ans, score);
50            }
51        }
52
53        /*
54         * Original state ke liye answer store karo
55         */
56        dp[l][originalR][originalK] = ans;
57
58        return ans;
59    }
60}