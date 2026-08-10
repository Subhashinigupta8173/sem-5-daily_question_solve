// Last updated: 9/8/2026, 9:16:31 pm
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxCount = 0;
4        int currentCount = 0;
5
6        for (int num : nums) {
7            if (num == 1) {
8                currentCount++;
9                maxCount = Math.max(maxCount, currentCount);
10            } else {
11                currentCount = 0;
12            }
13        }
14
15        return maxCount;
16    }
17
18}
19