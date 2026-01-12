// Last updated: 12/1/2026, 8:27:32 am
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int n=points.length;
4       
5       
6        int time=0;
7       
8        for(int i=1; i<n; i++){
9            int dx = Math.abs(points[i][0] - points[i - 1][0]);
10            int dy = Math.abs(points[i][1] - points[i - 1][1]);
11            time += Math.max(dx, dy);
12
13
14        }
15        return  time;
16        
17
18
19    }
20}