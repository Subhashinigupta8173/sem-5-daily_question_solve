// Last updated: 26/8/2026, 10:51:55 pm
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int n = g.length;
4        int m = s.length;
5        int c = 0;
6        int j = 0;
7        if(m == 0 || n == 0){
8            return 0;
9        }
10        Arrays.sort(g);
11        Arrays.sort(s);
12
13        for (int i = 0; i < n && j < m; i++) {
14            if (s[j] >= g[i]) {
15                c++;
16                j++;
17            }
18            else{
19                j++;
20                i--;
21            }
22        }
23        return c;
24
25        
26    }
27}