// Last updated: 5/10/2026, 1:35:16 pm
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        st.push(0);
5        for(int i = 0; i < s.length(); i++) {
6            if(s.charAt(i) == '(') {
7                st.push(0);
8            } 
9            else {
10                int x = st.pop();
11
12                if(x == 0) {
13                    x = 1;
14                } 
15                else {
16                    x = 2 * x;
17                }
18
19                int parent = st.pop();
20                st.push(parent + x);
21            }
22        }
23
24        return st.pop();
25    }
26}