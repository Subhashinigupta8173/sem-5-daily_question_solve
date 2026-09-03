// Last updated: 3/9/2026, 1:32:18 am
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3       
4        int []dist =  new int[n];
5        Arrays.fill(dist,Integer.MAX_VALUE);
6        dist[src] = 0;
7        for(int i = 0; i<=k; i++){
8            int [] temp =  dist.clone();
9            for(int [] f : flights){
10                int u = f[0];
11                int v = f[1];
12                int price = f[2];
13                if(dist[u] != Integer.MAX_VALUE && dist[u] + price < temp[v]){
14                    temp[v] = dist[u]+price;
15                }
16            }
17            dist = temp;
18        }
19        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
20
21
22
23        
24    }
25}