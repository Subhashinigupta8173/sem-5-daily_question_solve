// Last updated: 9/12/2025, 10:25:07 pm
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0, starIndex = -1, matchIndex = 0;
4
5        while (i < s.length()) {
6            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
7                i++;
8                j++;
9            } 
10            else if (j < p.length() && p.charAt(j) == '*') {
11                starIndex = j;
12                matchIndex = i;
13                j++;
14            } 
15            else if (starIndex != -1) {
16                j = starIndex + 1;
17                matchIndex++;
18                i = matchIndex;
19            } 
20            else {
21                return false;
22            }
23        }
24
25        while (j < p.length() && p.charAt(j) == '*') {
26            j++;
27        }
28
29        return j == p.length();
30    }
31}
32