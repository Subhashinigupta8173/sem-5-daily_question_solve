// Last updated: 29/8/2026, 2:40:38 am
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
5            return -1;
6        }
7        Queue<int[]> q = new LinkedList<>();
8        q.offer(new int[]{0,0,1});
9        grid[0][0] = 1;
10        int[] dr = {-1,-1,-1,0,0,1,1,1};
11        int[] dc = {-1,0,1,-1,1,-1,0,1};
12
13        while(!q.isEmpty()){
14            int [] top = q.poll();
15            int r = top[0];
16            int c = top[1];
17            int dist = top[2];
18            if(r == n -1 && c == n - 1){
19                return dist;
20
21            }
22            for(int k = 0; k < 8;k++){
23                int newrow = r + dr[k];
24                int newcol = c + dc[k];
25                if(newrow >= 0 && newrow < n  && newcol >= 0 && newcol < n && grid[newrow][newcol] == 0 ){
26                    grid[newrow][newcol] = 1;
27                    q.offer(new int []{newrow,newcol,dist+1});
28                }
29            }
30
31        }
32        return -1;
33        
34    }
35}