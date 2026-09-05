// Last updated: 5/9/2026, 3:30:11 am
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
4        for(int i = 0; i <= n; i++){
5            adj.add(new ArrayList<>());
6
7
8        }
9        for(int [] edge: times){
10            int u = edge[0];
11            int v = edge[1];
12            int t = edge[2];
13            adj.get(u).add(new int []{v,t});
14        }
15        int[] dist= new int [n+1];
16        Arrays.fill(dist,Integer.MAX_VALUE);
17        dist[k] = 0;
18        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
19        pq.offer(new int[]{0,k});
20
21        while(!pq.isEmpty()){
22            int []current = pq.poll();
23            int time = current[0];
24            int node = current[1];
25            if(time > dist[node]){
26                continue;
27            }
28            for(int []edge : adj.get(node)){
29                int next = edge[0];
30                int weight = edge [1];
31                int newtime = time + weight;
32                if(newtime < dist[next]){
33                    dist[next] = newtime;
34                    pq.offer(new int []{newtime,next});
35                    
36                }
37            }
38        }
39        int ans = 0;
40        for(int i = 1 ;i<=n; i++){
41            if(dist[i] == Integer.MAX_VALUE){
42                return -1;
43
44            }
45            ans = Math.max(ans,dist[i]);
46        }
47        return ans;
48
49
50        
51    }
52}