// Last updated: 29/10/2026, 11:01:43 pm
1import java.util.*;
2
3class Solution {
4    int N;
5    int[] bit;
6    int LOG;
7    int[][] up;
8    int[] depth;
9
10    void add(int i, int x) {
11        for (; i <= N + 1; i += i & -i) bit[i] ^= x;
12    }
13
14    int get(int i) {
15        int r = 0;
16        for (; i > 0; i -= i & -i) r ^= bit[i];
17        return r;
18    }
19
20    void rangeXor(int l, int r, int x) {
21        add(l, x);
22        add(r + 1, x);
23    }
24
25    int lca(int u, int v) {
26        if (depth[u] < depth[v]) { int t = u; u = v; v = t; }
27        int d = depth[u] - depth[v];
28        for (int j = 0; j < LOG; j++) if (((d >> j) & 1) == 1) u = up[j][u];
29        if (u == v) return u;
30        for (int j = LOG - 1; j >= 0; j--) {
31            if (up[j][u] != up[j][v]) { u = up[j][u]; v = up[j][v]; }
32        }
33        return up[0][u];
34    }
35
36    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
37        N = n;
38        bit = new int[n + 2];
39        int[] head = new int[n];
40        Arrays.fill(head, -1);
41        int[] nxt = new int[2 * n];
42        int[] to = new int[2 * n];
43        int cnt = 0;
44        for (int[] e : edges) {
45            to[cnt] = e[1]; nxt[cnt] = head[e[0]]; head[e[0]] = cnt++;
46            to[cnt] = e[0]; nxt[cnt] = head[e[1]]; head[e[1]] = cnt++;
47        }
48        LOG = 1;
49        while ((1 << LOG) < n) LOG++;
50        up = new int[LOG][n];
51        depth = new int[n];
52        int[] tin = new int[n], tout = new int[n];
53        int[] it = head.clone();
54        int[] stack = new int[n];
55        int sp = 0, timer = 1;
56        stack[sp++] = 0;
57        tin[0] = 1;
58        while (sp > 0) {
59            int u = stack[sp - 1];
60            if (it[u] != -1) {
61                int e = it[u];
62                it[u] = nxt[e];
63                int v = to[e];
64                if (v == up[0][u]) continue;
65                up[0][v] = u;
66                depth[v] = depth[u] + 1;
67                tin[v] = ++timer;
68                stack[sp++] = v;
69            } else {
70                tout[u] = timer;
71                sp--;
72            }
73        }
74        for (int j = 1; j < LOG; j++)
75            for (int v = 0; v < n; v++) up[j][v] = up[j - 1][up[j - 1][v]];
76
77        char[] cs = s.toCharArray();
78        for (int u = 0; u < n; u++) rangeXor(tin[u], tout[u], 1 << (cs[u] - 'a'));
79
80        List<Boolean> res = new ArrayList<>();
81        for (String q : queries) {
82            String[] p = q.split(" ");
83            if (p[0].equals("update")) {
84                int u = Integer.parseInt(p[1]);
85                char c = p[2].charAt(0);
86                if (cs[u] != c) {
87                    int x = (1 << (cs[u] - 'a')) ^ (1 << (c - 'a'));
88                    rangeXor(tin[u], tout[u], x);
89                    cs[u] = c;
90                }
91            } else {
92                int u = Integer.parseInt(p[1]);
93                int v = Integer.parseInt(p[2]);
94                int l = lca(u, v);
95                int m = get(tin[u]) ^ get(tin[v]) ^ (1 << (cs[l] - 'a'));
96                res.add((m & (m - 1)) == 0);
97            }
98        }
99        return res;
100    }
101}