// Last updated: 10/9/2025, 12:39:36 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
		int [][] dp=new int[matrix.length][matrix[0].length];
		for(int[] a:dp) {
			Arrays.fill(a, -66666);
		}
		for(int col=0; col<matrix[0].length; col++) {
			ans=Math.min(ans, Minimum_falling_path(matrix,0,col,dp));
		}
        return ans;
	}
	public static int Minimum_falling_path(int[][] matrix,int cr,int cc,int [] [] dp ) {
		if(cc<0 | cc>=matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr==matrix.length-1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=-66666) {
			return dp[cr][cc];
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0; i<matrix[0].length; i++) {
			if(i==cc) {
				continue;
			}
			ans=Math.min(ans,Minimum_falling_path(matrix,cr+1,i,dp));
		}
	   return dp[cr][cc]=ans+matrix[cr][cc];
		
	}
        

}