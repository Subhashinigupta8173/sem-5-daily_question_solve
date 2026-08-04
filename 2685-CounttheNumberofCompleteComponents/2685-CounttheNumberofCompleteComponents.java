// Last updated: 4/8/2026, 3:54:20 am
1class Solution {
2    int nodes;
3    int degree;
4    public int countCompleteComponents(int n, int[][] edges) {
5        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
6
7        for (int i = 0; i < n; i++) {
8            adj.add(new ArrayList<>());
9        }
10
11        for (int[] e : edges) {
12            adj.get(e[0]).add(e[1]);
13            adj.get(e[1]).add(e[0]);
14        }
15
16        boolean[] visited = new boolean[n];
17        int ans = 0;
18        for (int i = 0; i < n; i++) {
19
20            if (!visited[i]) {
21                nodes = 0;
22                degree = 0;
23                dfs(i, adj, visited);
24                int edgeCount = degree / 2;
25                if (edgeCount == nodes * (nodes - 1) / 2) {
26                    ans++;
27                }
28            }
29        }
30
31        return ans;
32    }
33
34    void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
35
36        vis[node] = true;
37
38        nodes++;
39
40        degree += adj.get(node).size();
41
42        for (int nbr : adj.get(node)) {
43
44            if (!vis[nbr]) {
45                dfs(nbr, adj, vis);
46            }
47        }
48    }
49}