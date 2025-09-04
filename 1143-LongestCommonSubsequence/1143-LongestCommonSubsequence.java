// Last updated: 4/9/2025, 12:12:48 pm
class Solution {

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[amount + 1][n]; 
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(coins, amount, 0, dp);
        
    }

    private int helper(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) return 1;      
        if (i == coins.length) return 0; 

        if (dp[amount][i] != -1) return dp[amount][i];

        int inc = 0, exc = 0;
        if (amount >= coins[i]) {
            inc = helper(coins, amount - coins[i], i, dp); 
        }

        exc = helper(coins, amount, i + 1, dp); 

        return dp[amount][i] = inc + exc;
    }

    
}
