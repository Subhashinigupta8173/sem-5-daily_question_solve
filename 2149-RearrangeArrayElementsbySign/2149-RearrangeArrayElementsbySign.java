// Last updated: 19/9/2026, 9:53:41 pm
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int pos  = 0;
5        int neg = 1;
6        int [] ans  = new int[n];
7        for(int i = 0 ; i < n; i++){
8            if(nums[i] > 0){
9                ans[pos] = nums[i];
10                pos += 2;
11            }
12            else{
13                ans[neg] = nums[i];
14                neg += 2;
15            }
16        }
17
18        return ans;
19    }
20}