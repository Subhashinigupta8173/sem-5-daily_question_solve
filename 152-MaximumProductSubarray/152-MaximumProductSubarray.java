// Last updated: 12/7/2026, 8:01:15 am
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int [] maxDp = new int [n];
5        int [] minDp = new int [n];
6        maxDp[0] = nums[0];
7        minDp[0] = nums[0];
8        int ans = nums[0];
9        for(int i=1; i < n; i++){
10            int a = nums[i];
11            int b= nums[i] * maxDp[i - 1];
12            int c = nums[i] * minDp[i - 1];
13            maxDp[i] = Math.max(a, Math.max(b, c));
14            minDp[i] = Math.min(a, Math.min(b, c));
15            ans = Math.max(ans, maxDp[i]);
16            
17        
18        }
19        return ans;
20
21        
22    }
23}