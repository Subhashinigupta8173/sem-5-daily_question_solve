// Last updated: 22/8/2026, 8:04:37 am
1class Solution {
2    public int numberOfArithmeticSlices(int[] arr) {
3        int n = arr.length;
4
5        if (n < 3) {
6            return 0;
7        }
8
9        int count = 0;
10        int ans = 0;
11
12        for (int i = 2; i < n; i++) {
13
14            if (arr[i] - arr[i - 1] == arr[i - 1] - arr[i - 2]) {
15                count++;
16                ans += count;
17            } else {
18                count = 0;
19            }
20        }
21
22        return ans;
23    }
24}