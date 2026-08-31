// Last updated: 31/8/2026, 5:24:53 am
1class Solution {
2    int max = -1;
3    public int longestCycle(int[] edges) {
4        int n = edges.length;
5       
6        boolean[] visited = new boolean[n];
7        boolean[] path = new boolean[n];
8        int [] depth = new int [n];
9        int currentcount = 0;
10        for (int i = 0; i < n; i++) {
11            if (!visited[i]) {
12                dfs(i, edges, visited, path, n,depth,0);
13            }
14        }
15        return max;
16
17    }
18
19    public void dfs(int node,int []edges ,boolean[]visited,boolean [] path,int n,int[] depth ,int currentcount){
20        path[node] = true;
21        visited[node] = true;
22        depth[node] = currentcount;
23        int nbrs  = edges[node];
24        if(nbrs != -1){
25            if(!visited[nbrs]){
26
27                dfs(nbrs,edges,visited,path,n,depth,currentcount+1);
28            }
29            else if(path[nbrs]){
30                int cycle = currentcount - depth[nbrs] + 1;
31                max = Math.max(max,cycle);
32
33            }
34        }
35        path[node] = false;
36    }
37}