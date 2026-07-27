// Last updated: 27/7/2026, 2:20:14 am
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int fresh = 0;
6        Queue<int[]> q = new LinkedList<>();
7        for(int i =0;i<m;i++){
8            for(int j = 0;j<n;j++){
9                if(grid[i][j] == 2){
10                    q.offer(new int []{i,j});
11                }
12                else if (grid[i][j] == 1){
13                    fresh++;
14                }
15            }
16        }
17        if(fresh == 0){
18            return 0;
19        }
20        int min = 0;
21        int[] dr = {-1,1,0,0};
22        int[] dc = {0,0,-1,1};
23        //apply bsf on all rotten oranges
24        while(!q.isEmpty() && fresh >0){
25            int size  = q.size();
26            for(int i  = 0;i<size;i++){
27                int [] curr = q.poll();
28                int row = curr[0];
29                int col = curr[1];
30                
31                for(int k = 0;k<4;k++){
32                    int newRow = row+dr[k];
33                    int newcol = col+dc[k];
34                    if(newRow >= 0 && newRow<m && newcol>=0 &newcol <n && grid[newRow][newcol]==1){
35                        grid[newRow][newcol] = 2;
36                        fresh --;
37                        q.offer(new int []{newRow,newcol});
38
39                    }
40
41
42                }
43
44
45            }
46            min++;
47           
48
49        }
50        return fresh == 0 ? min : -1;
51        
52        
53    }
54}