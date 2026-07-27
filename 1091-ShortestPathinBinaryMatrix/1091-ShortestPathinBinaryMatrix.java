// Last updated: 27/7/2026, 4:15:50 am
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3
4        int n = grid.length;
5
6        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
7            return -1;
8
9        Queue<int[]> q = new LinkedList<>();
10
11        q.offer(new int[]{0, 0, 1});
12
13        grid[0][0] = 1;
14
15        int[] dr = {-1,-1,-1,0,0,1,1,1};
16        int[] dc = {-1,0,1,-1,1,-1,0,1};
17
18        while (!q.isEmpty()) {
19
20            int[] curr = q.poll();
21
22            int row = curr[0];
23            int col = curr[1];
24            int dist = curr[2];
25
26            if (row == n - 1 && col == n - 1)
27                return dist;
28
29            for (int k = 0; k < 8; k++) {
30
31                int newRow = row + dr[k];
32                int newCol = col + dc[k];
33
34                if (newRow >= 0 &&
35                    newRow < n &&
36                    newCol >= 0 &&
37                    newCol < n &&
38                    grid[newRow][newCol] == 0) {
39
40                    grid[newRow][newCol] = 1;
41
42                    q.offer(new int[]{newRow, newCol, dist + 1});
43                }
44            }
45        }
46
47        return -1;
48    }
49}