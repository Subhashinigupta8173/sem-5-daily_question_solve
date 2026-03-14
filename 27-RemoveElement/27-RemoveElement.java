// Last updated: 14/3/2026, 5:22:55 pm
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3
4        int n = nums.length;
5
6        for(int i = 0; i < n; i++){
7            while(nums[i] > 0 && nums[i] <= n && nums[nums[i]-1] != nums[i]){
8                int temp = nums[i];
9                nums[i] = nums[temp-1];
10                nums[temp-1] = temp;
11            }
12        }
13
14        for(int i = 0; i < n; i++){
15            if(nums[i] != i+1){
16                return i+1;
17            }
18        }
19
20        return n+1;
21    }
22}