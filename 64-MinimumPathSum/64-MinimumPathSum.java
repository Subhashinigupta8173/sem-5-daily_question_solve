// Last updated: 15/7/2026, 11:44:31 am
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int sum=0;
4        int m= grid.length;
5        int n=grid[0].length;
6
7        for(int i=0;i<m;i++){
8            for(int  j=0;j<n;j++){
9                if(i >0 && j>0){
10                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
11                }
12                else if(i>0){
13                    grid[i][j]+=grid[i-1][j];
14                }
15                else if(j>0){
16                    grid[i][j]+=grid[i][j-1];
17
18                }
19            }
20        }
21        return grid[m-1][n-1];
22
23
24    }
25}