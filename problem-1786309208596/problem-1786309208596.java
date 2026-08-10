// Last updated: 10/8/2026, 2:30:08 am
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int n = fruits.length;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        int left = 0;
6        int ans = 0;
7
8        for (int right = 0; right < n; right++) {
9
10            map.put(fruits[right],
11                    map.getOrDefault(fruits[right], 0) + 1);
12
13            while (map.size() > 2) {
14                map.put(fruits[left], map.get(fruits[left]) - 1);
15
16                if (map.get(fruits[left]) == 0) {
17                    map.remove(fruits[left]);
18                }
19                left++;
20            }
21            ans = Math.max(ans, right - left + 1);
22        }
23        return ans;
24    }
25}