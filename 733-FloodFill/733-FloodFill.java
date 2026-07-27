// Last updated: 27/7/2026, 8:27:04 am
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int m = image.length;
4        int n = image[0].length;
5        int originalColor = image[sr][sc];
6         if (originalColor == color)
7            return image;
8
9        Queue<int []>q = new LinkedList<>();
10        
11        q.offer(new int []{sr,sc});
12        image[sr][sc] = color;
13        int [] dr = {-1,1,0,0};
14        int [] dc=  {0,0,-1,1};
15        while(!q.isEmpty()){
16
17            int[] curr =  q.poll();
18            int r = curr[0];
19            int c = curr[1];
20            for(int i = 0; i < 4; i++){
21                int nr = r + dr[i];
22                int nc = c + dc[i];
23                if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == originalColor ){
24                    image[nr][nc] = color;
25                    q.offer(new int []{nr,nc});
26                }
27            }
28
29        }
30        return image;
31    }
32}