// Last updated: 8/7/2026, 12:07:19 pm
1class Solution {
2    public int[] findRightInterval(int[][] intervals) {
3        int n = intervals.length;
4        int [][] start =  new int [n][2];
5        for(int i = 0; i < n; i++){
6            start[i][0] = intervals[i][0];
7            start[i][1] = i;
8        }
9        Arrays.sort(start, (a, b) -> Integer.compare(a[0], b[0]));
10        int [] arr = new int[n];
11        for(int i = 0; i < n; i++){
12            int end = intervals[i][1];
13            int low = 0;
14
15            int high = n - 1;
16            int idx = -1;
17            while(low <= high){
18                int mid = low + (high - low)/2;
19                if(start[mid][0] >= end){
20                    idx = start[mid][1];
21                    high = mid - 1;
22                }
23                else{
24                    low = mid + 1;
25                }
26            }
27            arr[i] = idx;
28
29        }
30        return arr;
31        
32    }
33}