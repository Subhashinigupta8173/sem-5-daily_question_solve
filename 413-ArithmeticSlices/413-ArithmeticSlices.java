// Last updated: 22/8/2026, 11:28:40 am
1class Solution {
2    public boolean makesquare(int[] matchsticks) {
3
4        int sum = 0;
5
6        for (int x : matchsticks) {
7            sum += x;
8        }
9
10        if (sum % 4 != 0) {
11            return false;
12        }
13
14        int target = sum / 4;
15
16        int[] side = new int[4];
17
18        return solve(matchsticks, 0, target, side);
19    }
20
21    public boolean solve(int[] matchsticks, int index, int target, int[] side) {
22
23        if (index == matchsticks.length) {
24            return side[0] == target &&
25                   side[1] == target &&
26                   side[2] == target &&
27                   side[3] == target;
28        }
29
30        int stick = matchsticks[index];
31
32        for (int i = 0; i < 4; i++) {
33
34            if (side[i] + stick <= target) {
35
36                side[i] += stick;
37
38                if (solve(matchsticks, index + 1, target, side)) {
39                    return true;
40                }
41
42                side[i] -= stick;
43            }
44
45           
46            if (side[i] == 0) {
47                break;
48            }
49        }
50
51        return false;
52    }
53}