// Last updated: 21/1/2026, 11:27:49 pm
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int hash[] = new int[256]; 
4        Arrays.fill(hash, -1);
5        int n = s.length();
6        int l = 0, r = 0;
7        int maxL = 0;
8
9        while (r < n) {
10            if (hash[s.charAt(r)] != -1 && hash[s.charAt(r)] >= l) {
11                l = hash[s.charAt(r)] + 1;
12            }
13            maxL = Math.max(maxL, r - l + 1);
14            hash[s.charAt(r)] = r;
15            r++;
16        }
17
18        return maxL;
19    }
20}
21
22