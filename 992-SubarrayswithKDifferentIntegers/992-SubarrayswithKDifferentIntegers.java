// Last updated: 11/8/2026, 4:26:48 am
1class Solution {
2
3    public int subarraysWithKDistinct(int[] nums, int k) {
4        return atMost(nums, k) - atMost(nums, k - 1);
5    }
6
7    public int atMost(int[] nums, int k) {
8
9        HashMap<Integer, Integer> map = new HashMap<>();
10
11        int ei = 0;
12        int si = 0;
13        int ans = 0;
14        int n = nums.length;
15
16        while (ei < n) {
17
18            map.put(nums[ei], map.getOrDefault(nums[ei], 0) + 1);
19            ei++;
20
21            if (map.size() > k) {
22
23                while (map.size() > k) {
24
25                    int val = nums[si];
26
27                    if (map.get(val) == 1) {
28                        map.remove(val);
29                    } else {
30                        map.put(val, map.get(val) - 1);
31                    }
32
33                    si++;
34                }
35            }
36
37            ans += ei - si;
38        }
39
40        return ans;
41    }
42}