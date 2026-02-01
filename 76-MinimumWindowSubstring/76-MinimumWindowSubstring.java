// Last updated: 1/2/2026, 6:27:12 pm
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4
5        int[] freq = new int[128]; 
6        for (char c : t.toCharArray()) {
7            freq[c]++;
8        }
9
10        int left = 0, right = 0;
11        int count = t.length();
12        int minLen = Integer.MAX_VALUE;
13        int start = 0;
14
15        while (right < s.length()) {
16            char r = s.charAt(right);
17            if (freq[r] > 0) {
18                count--;
19            }
20            freq[r]--;
21            right++;
22
23            while (count == 0) {
24                if (right - left < minLen) {
25                    minLen = right - left;
26                    start = left;
27                }
28
29                char l = s.charAt(left);
30                freq[l]++;
31                if (freq[l] > 0) {
32                    count++;
33                }
34                left++;
35            }
36        }
37
38        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
39    }
40}
41