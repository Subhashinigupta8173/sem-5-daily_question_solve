// Last updated: 3/9/2025, 8:00:16 am
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int prev2 = 0;       
        int prev1 = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            int pick = nums[i] + prev2;  
            int skip = prev1;           
            int curr = Math.max(pick, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
