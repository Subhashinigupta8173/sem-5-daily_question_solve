// Last updated: 11/3/2026, 6:40:16 pm
1class Solution {
2    public String longestPalindrome(String s) {
3
4        String ans = "";
5
6        for(int i = 0; i < s.length(); i++) {
7
8           
9            String s1 = expand(s, i, i);
10
11           
12            String s2 = expand(s, i, i + 1);
13
14            if(s1.length() > ans.length())
15                ans = s1;
16
17            if(s2.length() > ans.length())
18                ans = s2;
19        }
20
21        return ans;
22    }
23
24    public String expand(String s, int left, int right){
25
26        while(left >= 0 && right < s.length() &&
27              s.charAt(left) == s.charAt(right)){
28
29            left--;
30            right++;
31        }
32
33        return s.substring(left + 1, right);
34    }
35}