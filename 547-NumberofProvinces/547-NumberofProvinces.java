// Last updated: 29/8/2026, 11:43:58 pm
1class Solution {
2   
3    public int findCircleNum(int[][] isConnected) {
4        int n = isConnected.length;
5        boolean[] visited = new boolean[n];
6        int c = 0 ;
7        for(int j = 0;j < n;j++){
8            if(!visited[j]){
9            c++;
10            dfs(isConnected,visited,j);
11                }       
12            }
13        return c;
14       
15    }
16
17
18
19    
20    public void dfs(int[][] isConnected,boolean [] visited,int i){
21        visited[i] = true;
22        for(int nbrs = 0; nbrs < isConnected.length;nbrs++){
23            if(isConnected[i][nbrs] == 1 && !visited[nbrs]){
24
25                dfs(isConnected,visited,nbrs);
26            }
27        }
28
29    }
30
31}