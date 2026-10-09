// Last updated: 9/10/2026, 3:23:00 pm
1
2class Solution {
3    public int minInsertions(String s) {
4        int open = 0;
5        int ans = 0;
6
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9
10            if (ch == '(') {
11                open++;
12            } else {
13                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
14                    i++;
15                } else {
16                    ans++;
17                }
18
19                if (open > 0) {
20                    open--;
21                } else {
22                    ans++;
23                }
24            }
25        }
26
27        return ans + open * 2;
28    }
29}