// Last updated: 3/2/2026, 12:10:23 am
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return 0; // Already at the last index
5        
6        int jumps = 0;   // Number of jumps made
7        int currEnd = 0; // End of the current jump range
8        int farthest = 0; // Farthest reachable index in the current range
9        
10        for (int i = 0; i < n - 1; i++) {
11            // Update the farthest we can reach from current index
12            farthest = Math.max(farthest, i + nums[i]);
13            
14            // If we have reached the end of the current jump, increase jumps
15            if (i == currEnd) {
16                jumps++;
17                currEnd = farthest;
18            }
19        }
20        
21        return jumps;
22    }
23}
24