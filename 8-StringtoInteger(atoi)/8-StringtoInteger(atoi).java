// Last updated: 19/1/2026, 9:50:17 pm
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) return 0;
4
5        int i = 0, n = s.length();
6        // 1. Skip leading whitespaces
7        while (i < n && s.charAt(i) == ' ') i++;
8
9        // 2. Handle sign
10        int sign = 1;
11        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
12            if (s.charAt(i) == '-') sign = -1;
13            i++;
14        }
15
16        // 3. Convert digits to integer
17        long result = 0; // use long to prevent overflow during calculation
18        while (i < n && Character.isDigit(s.charAt(i))) {
19            result = result * 10 + (s.charAt(i) - '0');
20
21            // 4. Check overflow
22            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
23            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
24
25            i++;
26        }
27
28        return (int)(sign * result);
29    }
30}
31