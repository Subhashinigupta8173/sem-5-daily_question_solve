// Last updated: 9/10/2026, 5:46:58 pm
1class Solution {
2    int c = 0;
3    public int countArrangement(int n) {
4        c = 0;
5        boolean[] used = new boolean[n + 1];
6        Solve(1, n, used);
7        return c;
8    }
9    public void Solve(int pos, int n, boolean[] used) {
10        if (pos > n) {
11            c++;
12            return;
13        }
14
15        for (int num = 1; num <= n; num++) {
16            if (!used[num] &&
17                (num % pos == 0 || pos % num == 0)) {
18                used[num] = true;
19                Solve(pos + 1, n, used);
20                used[num] = false;
21            }
22        }
23    }
24}