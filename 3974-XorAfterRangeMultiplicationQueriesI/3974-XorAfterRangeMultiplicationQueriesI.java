// Last updated: 30/8/2025, 8:24:14 pm
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD=1_000_000_007;
        int [][] mt=queries;
        for(int [] q: mt ){
            int l=q[0], r=q[1], k=q[2], v=q[3];
            for(int idx=l; idx<=r; idx+=k){
                nums[idx]=(int) ((1l*nums[idx]*v)%MOD);
                
            }
        }
        int xorval=0;
        for(int x:nums) xorval^=x;
        return xorval;
        
        
        
    }
}