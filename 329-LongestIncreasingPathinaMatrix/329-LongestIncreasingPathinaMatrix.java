// Last updated: 4/10/2026, 11:03:26 pm
1class Solution {
2    public int longestIncreasingPath(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int[][] indegree = new int[m][n];
8
9        int[] dr = {-1, 1, 0, 0};
10        int[] dc = {0, 0, -1, 1};
11
12        Queue<int[]> q = new LinkedList<>();
13
14       
15        for (int i = 0; i < m; i++) {
16            for (int j = 0; j < n; j++) {
17
18                for (int k = 0; k < 4; k++) {
19
20                    int ni = i + dr[k];
21                    int nj = j + dc[k];
22
23                    if (ni >= 0 && ni < m &&
24                        nj >= 0 && nj < n &&
25                        matrix[ni][nj] < matrix[i][j]) {
26
27                        indegree[i][j]++;
28                    }
29                }
30
31                if (indegree[i][j] == 0) {
32                    q.offer(new int[]{i, j});
33                }
34            }
35        }
36
37        int ans = 0;
38
39        
40        while (!q.isEmpty()) {
41
42            int size = q.size();
43            ans++;
44
45            for (int x = 0; x < size; x++) {
46
47                int[] cell = q.poll();
48
49                int i = cell[0];
50                int j = cell[1];
51
52                for (int k = 0; k < 4; k++) {
53
54                    int ni = i + dr[k];
55                    int nj = j + dc[k];
56
57                    if (ni >= 0 && ni < m &&
58                        nj >= 0 && nj < n &&
59                        matrix[ni][nj] > matrix[i][j]) {
60
61                        indegree[ni][nj]--;
62
63                        if (indegree[ni][nj] == 0) {
64                            q.offer(new int[]{ni, nj});
65                        }
66                    }
67                }
68            }
69        }
70
71        return ans;
72    }
73}