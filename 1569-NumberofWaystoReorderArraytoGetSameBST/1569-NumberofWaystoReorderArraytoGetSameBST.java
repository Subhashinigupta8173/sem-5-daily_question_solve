// Last updated: 18/10/2026, 10:17:10 pm
1class Solution {
2    private static final long MOD = 1_000_000_007L;
3    private long[][] C;
4
5    private long ways(List<Integer> a) {
6        int n = a.size();
7        if (n <= 2) return 1;
8        List<Integer> l = new ArrayList<>(), r = new ArrayList<>();
9        int root = a.get(0);
10        for (int i = 1; i < n; i++) {
11            if (a.get(i) < root) l.add(a.get(i));
12            else r.add(a.get(i));
13        }
14        return C[n - 1][l.size()] * ways(l) % MOD * ways(r) % MOD;
15    }
16
17    public int numOfWays(int[] nums) {
18        int n = nums.length;
19        C = new long[n + 1][n + 1];
20        for (int i = 0; i <= n; i++) {
21            C[i][0] = 1;
22            for (int j = 1; j <= i; j++)
23                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
24        }
25        List<Integer> list = new ArrayList<>();
26        for (int x : nums) list.add(x);
27        return (int) ((ways(list) - 1 + MOD) % MOD);
28    }
29}