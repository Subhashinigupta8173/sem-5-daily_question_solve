// Last updated: 20/10/2026, 9:46:40 pm
1class Solution {
2    public int sortableIntegers(int[] nums) {
3        int n = nums.length;
4        int[] sorted = nums.clone();
5        Arrays.sort(sorted);
6        List<Integer> divs = new ArrayList<>();
7        for (int i = 1; i * i <= n; i++) {
8            if (n % i == 0) {
9                divs.add(i);
10                if (i != n / i) divs.add(n / i);
11            }
12        }
13        int ans = 0;
14        for (int k : divs) {
15            boolean ok = true;
16            for (int s = 0; s < n && ok; s += k) {
17                int desc = 0, pos = -1;
18                for (int j = 0; j < k; j++) {
19                    int a = nums[s + j];
20                    int b = nums[s + (j + 1) % k];
21                    if (a > b) {
22                        desc++;
23                        pos = j;
24                        if (desc > 1) break;
25                    }
26                }
27                if (desc > 1) {
28                    ok = false;
29                    break;
30                }
31                int r = (desc == 0) ? 0 : (pos + 1) % k;
32                for (int j = 0; j < k; j++) {
33                    if (nums[s + (r + j) % k] != sorted[s + j]) {
34                        ok = false;
35                        break;
36                    }
37                }
38            }
39            if (ok) ans += k;
40        }
41        return ans;
42    }
43}