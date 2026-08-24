// Last updated: 23/8/2026, 9:17:16 pm
1class Solution {
2    public int countSubstrings(String s) {
3        int c = 0;
4        int n = s.length();
5
6        for (int i = 0; i < n; i++) {
7            for (int j = i; j < n; j++) {
8                if (isPalindrome(s, i, j)) {
9                    c++;
10                }
11            }
12        }
13
14        return c;
15    }
16
17    public static boolean isPalindrome(String s, int i, int j) {
18        while (i < j) {
19            if (s.charAt(i) != s.charAt(j)) {
20                return false;
21            }
22            i++;
23            j--;
24        }
25
26        return true;
27    }
28}