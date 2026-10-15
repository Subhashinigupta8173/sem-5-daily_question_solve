// Last updated: 15/10/2026, 11:59:11 am
1
2import java.util.*;
3
4class Solution {
5    public int sumCounts(List<Integer> nums) {
6        int sum = 0;
7        int n = nums.size();
8
9        for (int i = 0; i < n; i++) {
10            HashSet<Integer> ll = new HashSet<>();
11
12            for (int j = i; j < n; j++) {
13                if (!ll.contains(nums.get(j))) {
14                    ll.add(nums.get(j));
15                }
16
17                sum += ll.size() * ll.size();
18            }
19        }
20
21        return sum;
22    }
23}
24