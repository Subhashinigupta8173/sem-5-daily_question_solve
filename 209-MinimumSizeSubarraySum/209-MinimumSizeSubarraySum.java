// Last updated: 10/8/2026, 6:33:47 am
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int ei  = 0;
5        int si = 0;
6        int ans = 0;
7        int min = Integer.MAX_VALUE;
8        int sum = 0;
9        while(ei<n){
10            sum += nums[ei];
11            ei++;
12            while(sum  >= target){
13                ans = ei - si;
14                min = Math.min(min, ans);
15                sum -= nums[si];
16                si++;
17            }
18        }
19        if (min == Integer.MAX_VALUE) {
20            return 0;
21        }
22        return  min; 
23
24        
25    }
26}