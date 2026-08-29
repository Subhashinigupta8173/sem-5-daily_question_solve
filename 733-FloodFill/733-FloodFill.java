// Last updated: 29/8/2026, 7:10:39 am
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3    int n = image.length;
4    int m = image[0].length;
5    
6
7    Queue<int[]> q = new LinkedList<>();
8    q.offer(new int[]{sr,sc});
9    int pixel =image[sr][sc];
10    image[sr][sc] = color;
11    int [] dr = {-1,1,0,0};
12    int [] dc = {0,0,-1,1};
13    if(pixel == color){
14        return image;
15    }
16    while(!q.isEmpty()){
17        int [] curr = q.poll();
18        int r = curr[0];
19        int c = curr[1];
20        for(int i = 0; i<4; i++){
21            int nr = r + dr[i];
22            int nc = c + dc[i];
23            if(nc >= 0 && nc< m && nr >=0 && nr < n && image[nr][nc] == pixel ){
24                q.offer(new int[]{nr,nc});
25                image[nr][nc] = color;
26
27            }
28        }
29    }
30    return image;
31
32
33        
34    }
35}