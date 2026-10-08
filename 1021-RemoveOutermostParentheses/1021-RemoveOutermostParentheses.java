// Last updated: 8/10/2026, 11:18:17 am
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder st = new StringBuilder();
4        int count = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7
8            if (s.charAt(i) == '(') {
9                count++;
10
11                if (count > 1) {
12                    st.append(s.charAt(i));
13                }
14            }
15            else {
16                count--;
17
18                if (count > 0) {
19                    st.append(s.charAt(i));
20                }
21            }
22        }
23
24        return st.toString();
25    }
26}