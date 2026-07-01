// Last updated: 1/7/2026, 5:35:10 am
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3
4        int first = Integer.MAX_VALUE;
5        int second = Integer.MAX_VALUE;
6
7        for (int num : nums) {
8
9            if (num <= first) {
10                first = num;
11            }
12            else if (num <= second) {
13                second = num;
14            }
15            else {
16                return true;
17            }
18        }
19
20        return false;
21    }
22}