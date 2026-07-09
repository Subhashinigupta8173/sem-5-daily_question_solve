// Last updated: 8/7/2026, 10:08:48 pm
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        if (k < 0) return 0;
4
5        Arrays.sort(nums);
6
7        int i = 0, j = 1;
8        int count = 0;
9
10        while (i < nums.length && j < nums.length) {
11
12            if (i == j || nums[j] - nums[i] < k) {
13                j++;
14            }
15            else if (nums[j] - nums[i] > k) {
16                i++;
17            }
18            else {
19                count++;
20                i++;
21
22                while (i < nums.length && nums[i] == nums[i - 1]) {
23                    i++;
24                }
25            }
26        }
27
28        return count;
29    }
30}