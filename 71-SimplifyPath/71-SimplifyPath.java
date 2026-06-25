// Last updated: 25/6/2026, 5:11:23 pm
1class Solution {
2    public String simplifyPath(String path) {
3
4        Stack<String> st = new Stack<>();
5        String[] parts = path.split("/");
6
7        for (String part : parts) {
8
9            if (part.equals("") || part.equals(".")) {
10                continue;
11            }
12
13            if (part.equals("..")) {
14                if (!st.isEmpty()) {
15                    st.pop();
16                }
17            } else {
18                st.push(part);
19            }
20        }
21
22        if (st.isEmpty()) {
23            return "/";
24        }
25
26        StringBuilder ans = new StringBuilder();
27
28        for (String dir : st) {
29            ans.append("/").append(dir);
30        }
31
32        return ans.toString();
33    }
34}