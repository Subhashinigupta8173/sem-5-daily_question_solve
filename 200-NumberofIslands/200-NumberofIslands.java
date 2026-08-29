// Last updated: 29/8/2026, 7:45:44 am
1class Solution {
2    boolean [][] visited;
3    public int numIslands(char[][] grid) {
4        
5        int m = grid.length;
6        int n = grid[0].length;
7        int count = 0 ;
8        int[] dc = {-1, 1, 0, 0};
9        int[] dr = {-0 ,0, -1, 1};
10        Queue<int[]>q = new LinkedList<>();
11        for(int i  =0;i < m;i++){
12            for(int j = 0; j < n;j++){
13                if(grid[i][j] == '1'){
14                    grid[i][j] = 'A';
15                    count++;
16                    q.offer(new  int []{i,j});
17                    while(!q.isEmpty()){
18                        int [] top = q.poll();
19                        int r = top[0];
20                        int c = top[1];
21                        for(int k  = 0;k<4;k++){
22                            int nr = r + dr[k];
23                            int nc = c + dc[k];
24                            if(nr>= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == '1'){
25                                q.offer(new int[]{nr,nc});
26                                grid[nr][nc] = 'A';
27                            }
28                        }
29                    }
30
31                }
32            }
33        }
34        return count;
35
36
37    }
38    
39
40}