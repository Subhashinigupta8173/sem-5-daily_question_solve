// Last updated: 2/12/2025, 11:08:02 pm
1class Solution {
2    public boolean isValid(String s) {
3         Stack<Character> st = new Stack<>();
4        
5        for (char ch : s.toCharArray()) {
6            // Push opening brackets
7            if (ch == '(' || ch == '{' || ch == '[') {
8                st.push(ch);
9            } else {
10                // If stack empty and closing bracket appears -> NOT valid
11                if (st.isEmpty()) return false;
12                
13                char top = st.pop();
14                
15                // Check mismatch
16                if (ch == ')' && top != '(') return false;
17                if (ch == '}' && top != '{') return false;
18                if (ch == ']' && top != '[') return false;
19            }
20        }
21        
22        // At end stack must be empty
23        return st.isEmpty();
24        
25    }
26}