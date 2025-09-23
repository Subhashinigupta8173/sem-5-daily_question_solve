// Last updated: 23/9/2025, 11:46:55 pm
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // Already at the last index
        
        int jumps = 0;   // Number of jumps made
        int currEnd = 0; // End of the current jump range
        int farthest = 0; // Farthest reachable index in the current range
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest we can reach from current index
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we have reached the end of the current jump, increase jumps
            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }
        }
        
        return jumps;
    }
}
