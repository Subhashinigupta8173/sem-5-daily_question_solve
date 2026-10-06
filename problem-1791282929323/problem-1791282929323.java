// Last updated: 6/10/2026, 4:05:29 pm
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st = new Stack<>();
4        int c = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7
8            if (st.isEmpty()) {
9                st.push(s.charAt(i));
10            }
11            else if (s.charAt(i) == ')' && st.peek() == '(') {
12                st.pop();
13                c++;
14            }
15            else {
16                st.push(s.charAt(i));
17            }
18        }
19
20        return s.length() - 2 * c;
21    }
22}