// Last updated: 9/12/2025, 7:55:39 pm
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st=new Stack<>();
4          st.push(-1);
5        int max=0;
6        for(int i=0; i<s.length(); i++){
7            if(s.charAt(i)=='('){
8                st.push(i);
9
10            }
11            else{
12                st.pop();
13                if(st.isEmpty()){
14                    st.push(i);
15                }
16                else{
17                    max=Math.max(max,i-st.peek());
18
19                }
20            }
21
22        }
23        return max;
24        
25    }
26}