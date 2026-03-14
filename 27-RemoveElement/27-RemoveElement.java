// Last updated: 14/3/2026, 5:39:51 pm
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7            max=Math.max(max,sum);
8            if(sum<0){
9                sum=0;
10            }
11
12        }
13        return max;
14
15        
16    }
17}