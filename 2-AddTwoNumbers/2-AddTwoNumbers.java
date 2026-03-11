// Last updated: 11/3/2026, 6:02:25 pm
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5
6        HashMap<Character,Integer> freq = new HashMap<>();
7
8        int j = 0;
9        int max = 0;
10
11        for(int i = 0; i < s.length(); i++){
12
13            char c = s.charAt(i);
14
15            freq.put(c, freq.getOrDefault(c,0) + 1);
16
17            while(freq.get(c) > 1){
18                char left = s.charAt(j);
19                freq.put(left, freq.get(left) - 1);
20                j++;
21            }
22
23            max = Math.max(max, i - j + 1);
24        }
25
26        return max;
27    }
28}