// Last updated: 28/9/2026, 2:05:55 pm
1class Solution {
2    public char kthCharacter(int k) {
3        StringBuilder original = new StringBuilder("a");
4        StringBuilder temp = new StringBuilder();
5        while (original.length() < k) {
6            temp = new StringBuilder();
7            for (int i = 0; i < original.length(); i++) {
8                char ch = original.charAt(i);
9                ch = (char) (ch + 1);
10                temp.append(ch);
11            }
12            original.append(temp);
13        }
14        return original.charAt(k-1);
15        
16
17    }
18}