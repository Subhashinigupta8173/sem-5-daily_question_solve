// Last updated: 8/7/2026, 10:22:17 pm
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        if (k < 0) return 0;
4
5        Arrays.sort(nums);
6
7        int i = 0, j = 1;
8        int c = 0;
9
10        while( i < nums.length && j <  nums.length){
11            if(i == j || nums[j] - nums[i] < k){
12                j++;
13            }
14            else if(nums[j] - nums[i] > k){
15                i++;
16            }
17            else{
18                i++;
19                c++;
20                while(i < nums.length && nums[i] == nums[i - 1]){
21                    i++;
22                }
23            }
24
25
26        }
27        return c;
28    }
29}