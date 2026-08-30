// Last updated: 29/8/2026, 11:08:18 pm
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        ArrayList<Integer>[] reverse = new ArrayList[n];
5        for (int i = 0; i < n; i++) {
6            reverse[i] = new ArrayList<>();
7        }
8        ArrayList<Integer> ans = new ArrayList<>();
9        int[] outdegree = new int[n];
10        for (int i = 0; i < n; i++) {
11            outdegree[i] = graph[i].length;
12            for (int nbrs : graph[i]) {
13                reverse[nbrs].add(i);
14            }
15
16        }
17        Queue<Integer> q = new LinkedList<>();
18
19        for (int i = 0; i < n; i++) {
20            if (outdegree[i] == 0) {
21                q.add(i);
22            }
23        }
24        while (!q.isEmpty()) {
25            int curr = q.poll();
26            ans.add(curr);
27            for (int node : reverse[curr]) {
28                outdegree[node]--;
29                if (outdegree[node] == 0) {
30                    q.add(node);
31
32                }
33            }
34
35        }
36        Collections.sort(ans);
37        return ans;
38
39    }
40}