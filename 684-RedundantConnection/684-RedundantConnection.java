// Last updated: 2/9/2026, 11:26:22 pm
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        int n =edges.length;
4        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
5        for(int i =0 ;i <= n;i++){
6            adj.add(new ArrayList<>());
7        }
8        for(int [] edge : edges){
9            int u = edge[0];
10            int v = edge[1];
11            boolean [] visited  = new boolean[n+1];
12            if(dfs(u,v,adj,visited)){
13                return edge;
14            }
15            adj.get(u).add(v);
16            adj.get(v).add(u);
17        }
18        return new int[0];
19
20        
21    }
22    public boolean dfs(int curr ,int target,ArrayList<ArrayList<Integer>> adj,boolean[]visited){
23        if(curr == target){
24            return true;
25        }
26        visited[curr] = true;
27        for(int nbr:adj.get(curr)){
28            if(!visited[nbr]){
29                if(dfs(nbr,target,adj,visited)){
30                    return true;
31                }
32            }
33        }
34        return false;
35
36    }
37}