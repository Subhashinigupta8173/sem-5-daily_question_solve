// Last updated: 29/1/2026, 11:35:27 am
1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0;
4        int j = height.length - 1;
5        int max = 0;
6
7        while (i < j) {
8            int minHeight = Math.min(height[i], height[j]);
9            int area = minHeight * (j - i);
10            max = Math.max(max, area);
11
12            // move the smaller height
13            if (height[i] < height[j]) {
14                i++;
15            } else {
16                j--;
17            }
18        }
19        return max;
20    }
21}
22