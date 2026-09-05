// Last updated: 5/9/2026, 4:53:38 am
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3
4        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
5
6        for (int i = 0; i < n; i++) {
7            adj.add(new ArrayList<>());
8        }
9
10        for (int[] edge : edges) {
11            int u = edge[0];
12            int v = edge[1];
13            int weight = edge[2];
14
15            
16            adj.get(u).add(new int[]{v, weight});
17            adj.get(v).add(new int[]{u, weight});
18        }
19
20        int answer = -1;
21        int minCount = Integer.MAX_VALUE;
22
23      
24        for (int source = 0; source < n; source++) {
25
26            int[] dist = new int[n];
27            Arrays.fill(dist, Integer.MAX_VALUE);
28
29            dist[source] = 0;
30
31         
32            PriorityQueue<int[]> pq =
33                new PriorityQueue<>((a, b) -> a[0] - b[0]);
34
35            pq.offer(new int[]{0, source});
36
37           
38            while (!pq.isEmpty()) {
39
40                int[] curr = pq.poll();
41
42                int distance = curr[0];
43                int u = curr[1];
44
45                if (distance > dist[u]) {
46                    continue;
47                }
48
49                for (int[] edge : adj.get(u)) {
50
51                    int v = edge[0];
52                    int weight = edge[1];
53
54                    int newDistance = distance + weight;
55
56                    if (newDistance < dist[v]) {
57
58                        dist[v] = newDistance;
59
60                        pq.offer(new int[]{newDistance, v});
61                    }
62                }
63            }
64
65        
66            int count = 0;
67
68            for (int i = 0; i < n; i++) {
69
70                if (i != source &&
71                    dist[i] <= distanceThreshold) {
72
73                    count++;
74                }
75            }
76
77           
78            if (count <= minCount) {
79                minCount = count;
80                answer = source;
81            }
82        }
83
84        return answer;
85    }
86}