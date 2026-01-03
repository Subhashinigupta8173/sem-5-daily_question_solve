// Last updated: 3/1/2026, 9:53:45 pm
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4
5      
6        for (int i = 0; i < n; i++) {
7            while (
8                nums[i] > 0 &&
9                nums[i] <= n &&
10                nums[nums[i] - 1] != nums[i]
11            ) {
12                int temp = nums[i];
13                nums[i] = nums[temp - 1];
14                nums[temp - 1] = temp;
15            }
16        }
17
18       
19        for (int i = 0; i < n; i++) {
20            if (nums[i] != i + 1) {
21                return i + 1;
22            }
23        }
24
25       
26        return n + 1;
27    }
28}
29