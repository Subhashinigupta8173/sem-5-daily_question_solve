// Last updated: 22/8/2026, 12:06:53 pm
1class Solution {
2    List<Integer> ll;
3
4    public boolean makesquare(int[] matchsticks) {
5
6        int sum = 0;
7
8        ll = new ArrayList<>();
9
10        for (int x : matchsticks) {
11            sum += x;
12            ll.add(x);
13        }
14
15        if (sum % 4 != 0) {
16            return false;
17        }
18
19        int tar = sum / 4;
20
21        Collections.sort(ll, Collections.reverseOrder());
22
23        return solve(0, 0, 0, 0, 0, tar);
24    }
25
26    public boolean solve(int s1, int s2, int s3, int s4,
27                         int i, int tar) {
28
29       
30        if (s1 > tar || s2 > tar ||
31            s3 > tar || s4 > tar) {
32            return false;
33        }
34
35        
36        if (i == ll.size()) {
37            return s1 == tar &&
38                   s2 == tar &&
39                   s3 == tar &&
40                   s4 == tar;
41        }
42
43        int stick = ll.get(i);
44
45        return solve(s1 + stick, s2, s3, s4, i + 1, tar) ||
46               solve(s1, s2 + stick, s3, s4, i + 1, tar) ||
47               solve(s1, s2, s3 + stick, s4, i + 1, tar) ||
48               solve(s1, s2, s3, s4 + stick, i + 1, tar);
49    }
50}