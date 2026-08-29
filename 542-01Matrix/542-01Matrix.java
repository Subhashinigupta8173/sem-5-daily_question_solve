// Last updated: 28/8/2026, 11:25:52 pm
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int n = mat.length;
4        int m = mat[0].length;
5        int [][] dist = new int [n][m];
6        Queue<int[]> q = new LinkedList<>();
7        for(int i = 0; i < n;i++){
8            for(int j = 0; j < m;j++){
9                if(mat[i][j] == 0){
10                    dist[i][j] = 0;
11                    q.offer(new int[] {i,j});
12                }
13                else{
14                    dist[i][j] = -1;
15                }
16            }
17        }
18        int[] dr= {-1,1,0,0};
19        int[] dc = {0,0,-1,1};
20        while(!q.isEmpty()){
21            int[] top = q.poll();
22            int index = top[0];
23            int dis = top[1];
24            for(int i = 0; i < 4; i++){
25                int nr = index + dr[i];
26                int nc = dis + dc[i];
27                if(nr >= 0 && nr < n && nc >= 0 && nc < m && dist[nr][nc] == -1){
28                    dist[nr][nc] = 1 + dist[index][dis];
29                    q.offer(new int []{nr,nc});
30
31                }
32            }
33
34        }
35        return dist;
36    }
37}