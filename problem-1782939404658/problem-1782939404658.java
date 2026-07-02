// Last updated: 2/7/2026, 2:26:44 am
1class Solution {
2    public boolean checkValidString(String s) {
3
4        int low = 0;
5        int high = 0;
6
7        for (char ch : s.toCharArray()) {
8
9            if (ch == '(') {
10                low++;
11                high++;
12            }
13            else if (ch == ')') {
14                low--;
15                high--;
16            }
17            else { // '*'
18                low--;
19                high++;
20            }
21
22            if (high < 0) {
23                return false;
24            }
25
26            low = Math.max(low, 0);
27        }
28
29        return low == 0;
30    }
31}