// Last updated: 24/10/2026, 12:06:27 am
1class Solution {
2    public int sortPermutation(int[] nums) {
3        int k = -1;  // all bits set: nothing misplaced yet
4        for (int i = 0; i < nums.length; i++)
5            if (nums[i] != i) {  // this number has to move
6                k &= nums[i];  // keep only the bits it shares
7                if (k == 0) return 0;  // bits only disappear, so 0 stays 0
8            }
9        return Math.max(k, 0);  // -1 means nothing has to move
10    }
11}