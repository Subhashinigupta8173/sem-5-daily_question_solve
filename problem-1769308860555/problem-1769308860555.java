// Last updated: 25/1/2026, 8:11:00 am
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n = nums.length;
4
5        
6        int i = n - 1;
7
8       
9        while (i > 0 && nums[i] > nums[i - 1]) {
10            i--;
11        }
12
13      
14        return i;
15    }
16}
17