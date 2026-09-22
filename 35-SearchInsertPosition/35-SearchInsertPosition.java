// Last updated: 22/9/2026, 4:07:25 pm
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low = 0;
4        int high  = nums.length - 1;
5        while(low <= high){
6            int mid = low + (high - low) / 2;
7            if(nums[mid] == target){
8                return mid;
9            }
10            else if(nums[mid] < target){
11                low= mid + 1;
12
13            }
14            else{
15                high = mid - 1;
16            }
17        }
18        return low;
19
20        
21    }
22}