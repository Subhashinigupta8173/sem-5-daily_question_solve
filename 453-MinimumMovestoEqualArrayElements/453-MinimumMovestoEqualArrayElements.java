// Last updated: 17/11/2026, 5:33:24 pm
1class Solution {
2    public int minMoves(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int n = nums.length;
5        int sum = 0;
6        for(int i = 0; i < n; i++){
7            min = Math.min(min,nums[i]);
8        }
9        for(int i = 0; i < n;i++){
10            sum += nums[i] - min;
11        }
12        return sum;
13        
14    }
15}