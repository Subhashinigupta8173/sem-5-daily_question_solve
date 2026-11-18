// Last updated: 18/11/2026, 8:34:58 pm
1class Solution {
2    public int minChanges(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i += 2) {
6
7            if (s.charAt(i) != s.charAt(i + 1)) {
8                count++;
9            }
10        }
11
12        return count;
13    }
14}