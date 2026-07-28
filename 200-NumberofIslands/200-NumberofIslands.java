// Last updated: 27/7/2026, 8:09:29 pm
1class Solution {
2    int[] dr = {-1, 1, 0, 0};
3    int[] dc = {0, 0, -1, 1};
4    public int numIslands(char[][] grid) {
5        int m = grid.length;
6        int n = grid[0].length;
7        int islands = 0;
8        Queue<int []> q = new LinkedList<>();
9        for(int i = 0; i < m ; i++){
10            for(int j = 0;j < n;j++){
11                if(grid[i][j] == '1'){
12                    islands++;
13                    grid[i][j] = '0';
14                    q.offer(new int []{i,j});
15                    while(!q.isEmpty()){
16                        int [] curr = q.poll();
17                        int r = curr[0];
18                        int c = curr[1];
19                        for(int k = 0 ; k < 4 ; k++){
20                            int nr = r + dr[k];
21                            int nc = c + dc[k];
22                            if(nc >= 0 && nc < n && nr >= 0 && nr < m && grid[nr][nc] ==  '1'){
23                                grid[nr][nc] = '0';
24                                q.offer(new int[]{nr,nc});
25                            }
26                        }
27
28                    }
29                }
30
31            }
32        }
33        return islands;
34
35
36        
37    }
38}