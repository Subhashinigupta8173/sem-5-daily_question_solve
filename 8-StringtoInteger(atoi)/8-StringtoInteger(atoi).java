// Last updated: 23/9/2025, 11:47:37 pm
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farthest = 0; // The farthest index we can reach
        
        for (int i = 0; i < n; i++) {
            // If current index is beyond the farthest reachable, we cannot continue
            if (i > farthest) return false;
            
            // Update the farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);
        }
        
        // If we can reach or go beyond the last index
        return farthest >= n - 1;
    }
}
