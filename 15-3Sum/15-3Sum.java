// Last updated: 29/1/2026, 12:16:12 pm
1class Solution {
2    public List<List<Integer>> threeSum(int[] arr) {
3        Arrays.sort(arr);
4        List<List<Integer>> res = new ArrayList<>();
5
6        for (int i = 0; i < arr.length - 2; i++) {
7
8            // ---- skip duplicate values for first element ----
9            if (i > 0 && arr[i] == arr[i - 1]) continue;
10
11            int j = i + 1;
12            int k = arr.length - 1;
13
14            while (j < k) {
15                int sum = arr[i] + arr[j] + arr[k];
16
17                if (sum == 0) {
18                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
19                    j++;
20                    k--;
21
22                    // ---- skip duplicate values for second element ----
23                    while (j < k && arr[j] == arr[j - 1]) j++;
24
25                    // ---- skip duplicate values for third element ----
26                    while (j < k && arr[k] == arr[k + 1]) k--;
27                }
28                else if (sum < 0) {
29                    j++;
30                }
31                else {
32                    k--;
33                }
34            }
35        }
36        return res;
37    }
38}
39