// Last updated: 29/1/2026, 12:57:25 pm
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int max = 0;
4        int left = 0;
5
6        HashSet<Character> set = new HashSet<>();
7
8        for (int right = 0; right < s.length(); right++) {
9
10            // remove characters until duplicate is gone
11            while (set.contains(s.charAt(right))) {
12                set.remove(s.charAt(left));
13                left++;
14            }
15
16            set.add(s.charAt(right));
17            max = Math.max(max, right - left + 1);
18        }
19
20        return max;
21    }
22}
23