// Last updated: 25/1/2026, 8:33:38 am
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        int [][] ce=edges;
4        List<Integer>[] graph=new ArrayList[n];
5        for(int i=0; i<n; i++) graph[i]=new ArrayList<>();
6        for(int [] e:ce){
7            graph[e[0]].add(e[1]);
8            graph[e[1]].add(e[0]);
9            
10        }
11        int[] dx=bfs(x,graph,n);
12        int []dy=bfs(y,graph,n);      
13        int []dz=bfs(z,graph,n);
14        int count=0;
15        for(int i=0; i<n; i++){
16            int a=dx[i];
17            int b=dy[i];
18            int c=dz[i];
19
20            int [] arr={a,b,c};
21            Arrays.sort(arr);
22            long p=(long)arr[0]*arr[0]+(long)arr[1]*arr[1];
23            long q=(long) arr[2]*arr[2];
24            if(p==q){
25                count++;
26            }
27        }
28        return count;
29
30        
31    }
32    private int[] bfs(int start,List<Integer>[]graph,int n){
33        int [] dist=new int[n];
34        Arrays.fill(dist,-1);
35        Queue<Integer> q=new ArrayDeque<>();
36        q.offer(start);
37        dist[start]=0;
38        while(!q.isEmpty()){
39            int u=q.poll();
40            for(int v:graph[u]){
41                if(dist[v]==-1){
42                    dist[v]=dist[u]+1;
43                    q.offer(v);
44                }
45            }
46        }
47        return dist;
48    }
49}