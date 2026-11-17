// Last updated: 17/11/2026, 6:40:45 pm
1class Solution {
2    public int findRadius(int[] houses, int[] heaters) {
3        Arrays.sort(houses);
4        Arrays.sort(heaters);
5
6        int max = Integer.MIN_VALUE;
7
8        for (int i = 0; i < houses.length; i++) {
9            int min = Integer.MAX_VALUE;
10
11            for (int j = 0; j < heaters.length; j++) {
12                min = Math.min(min,
13                    Math.abs(heaters[j] - houses[i]));
14            }
15
16            max = Math.max(max, min);
17        }
18
19        return max;
20    }
21}