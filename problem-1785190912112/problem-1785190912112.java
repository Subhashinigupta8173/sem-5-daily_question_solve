// Last updated: 28/7/2026, 3:51:52 am
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n= isConnected.length;
4        boolean [] visited = new boolean[n];
5        int c =0;
6        for(int  j=0;j<n;j++ ){
7            if(!visited[j]){
8                c++;
9                dfs(j,isConnected,visited);
10            }
11
12
13        }
14        return c;
15
16          
17    }
18    public static void dfs(int nodeCity,int[][] isConnected,boolean [] visited){
19
20        visited[nodeCity] = true;
21        for(int i =0 ;i<isConnected.length;i++){
22            if(isConnected[nodeCity][i] == 1 && !visited[i]){
23                dfs(i,isConnected,visited);
24            }
25        }
26    }
27        
28}