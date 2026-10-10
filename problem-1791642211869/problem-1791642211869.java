// Last updated: 10/10/2026, 7:53:31 pm
1class Solution {
2    public String shortestPalindrome(String s) {
3        StringBuilder rev = new StringBuilder(s).reverse();
4        String combined = s + "#" + rev;
5
6        int n = combined.length();
7        int[] lps = new int[n];
8
9        int len = 0;
10        int i = 1;
11
12        while (i < n) {
13            if (combined.charAt(i) == combined.charAt(len)) {
14                len++;
15                lps[i] = len;
16                i++;
17            } else {
18                if (len > 0) {
19                    len = lps[len - 1];
20                } else {
21                    lps[i] = 0;
22                    i++;
23                }
24            }
25        }
26
27        int longest = lps[n - 1];
28        String suffix = s.substring(longest);
29
30        return new StringBuilder(suffix).reverse().toString() + s;
31    }
32}