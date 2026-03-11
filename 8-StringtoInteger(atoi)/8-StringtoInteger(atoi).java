// Last updated: 11/3/2026, 7:19:46 pm
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for(int i = 0; i < s.length(); i++){
9
10            char c = s.charAt(i);
11
12            if(c == '(' || c == '{' || c == '['){
13                stack.push(c);
14            }
15            else{
16
17                if(stack.isEmpty()){
18                    return false;
19                }
20
21                char top = stack.pop();
22
23                if(c == ')' && top != '(') return false;
24                if(c == '}' && top != '{') return false;
25                if(c == ']' && top != '[') return false;
26            }
27        }
28
29        return stack.isEmpty();
30    }
31}