// Last updated: 17/11/2026, 2:02:35 pm
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int n = matrix.length;
4        int m =  matrix[0].length;
5        int [][] dp = new int[n][m];
6        int maxside = 0;
7        for(int i = 0; i < n; i++){
8            for(int j = 0;j < m; j++){
9                if(matrix[i][j] == '1'){
10                    if(i == 0 || j == 0){
11                        dp[i][j] = 1;
12                    }
13                    else{
14                        dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
15                    }
16
17                    maxside = Math.max(maxside,dp[i][j]);
18
19                }
20            }
21        }
22        return maxside * maxside;
23    }
24}