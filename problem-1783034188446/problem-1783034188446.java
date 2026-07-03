// Last updated: 3/7/2026, 4:46:28 am
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        int c=0;
5        int prend=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            if(intervals[i][0]>=prend){
8                prend=intervals[i][1];
9            }
10            else{
11                c++;
12                prend=Math.min(prend,intervals[i][1]);
13            }
14        }
15        return c;
16        
17    }
18}