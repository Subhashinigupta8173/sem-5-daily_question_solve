// Last updated: 21/8/2026, 10:53:01 am
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int  n = nums.length;
4        int [] [] dp = new int [n][n];
5        for(int i = 0; i < n ;i++){
6            Arrays.fill(dp[i],-1);
7        }
8        return solve(nums,0 ,n-1,dp) >= 0;
9    
10        
11
12    }
13    public int solve (int [] nums,int i ,int j,int[][]dp){
14        if( i == j){
15            return nums[i];
16        }
17        if(dp[i][j] != -1){
18            return dp[i][j];
19        }
20        int takei = nums[i] - solve(nums,i+1,j,dp);
21        int takej = nums[j] - solve(nums,i, j -1,dp );
22        return dp[i][j] = Math.max(takei,takej);
23    }
24}