// Last updated: 3/12/2025, 8:14:08 pm
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4        int currMax = 0, maxSum = Integer.MIN_VALUE;
5        int currMin = 0, minSum = Integer.MAX_VALUE;
6
7        for (int num : nums) {
8            total += num;
9
10            // Kadane for maximum subarray
11            currMax = Math.max(num, currMax + num);
12            maxSum = Math.max(maxSum, currMax);
13
14            // Kadane for minimum subarray
15            currMin = Math.min(num, currMin + num);
16            minSum = Math.min(minSum, currMin);
17        }
18
19        // If all numbers are negative, return maxSum
20        if (maxSum < 0) return maxSum;
21
22        return Math.max(maxSum, total - minSum);
23    }
24}
25