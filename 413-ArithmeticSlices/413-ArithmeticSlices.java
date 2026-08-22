// Last updated: 22/8/2026, 12:08:02 pm
1class Solution {
2    List<Integer> ll;
3
4    public boolean makesquare(int[] matchsticks) {
5        int sum = 0;
6
7        ll = new ArrayList<>();
8
9        for (int x : matchsticks) {
10            sum += x;
11            ll.add(x);
12        }
13
14        if (sum % 4 != 0) {
15            return false;
16        }
17
18        int tar = sum / 4;
19
20        Collections.sort(ll, Collections.reverseOrder());
21
22        return solve(0, 0, 0, 0, 0, tar);
23    }
24
25    public boolean solve(int s1, int s2, int s3, int s4, int i, int tar) {
26
27        if (s1 > tar || s2 > tar || s3 > tar || s4 > tar) {
28            return false;
29        }
30
31        if (i == ll.size()) {
32            if (s1 == tar && s2 == tar && s3 == tar && s4 == tar) {
33                return true;
34            }
35            return false;
36        }
37
38        if (
39            solve(s1 + ll.get(i), s2, s3, s4, i + 1, tar) ||
40            solve(s1, s2 + ll.get(i), s3, s4, i + 1, tar) ||
41            solve(s1, s2, s3 + ll.get(i), s4, i + 1, tar) ||
42            solve(s1, s2, s3, s4 + ll.get(i), i + 1, tar)
43        ) {
44            return true;
45        }
46
47        return false;
48    }
49}