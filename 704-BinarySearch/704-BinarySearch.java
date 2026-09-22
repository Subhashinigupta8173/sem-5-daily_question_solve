// Last updated: 22/9/2026, 3:37:42 pm
1
2class Solution {
3    public int search(int[] nums, int target) {
4        int low  = 0;
5        int high = nums.length - 1;
6        while(low <= high){
7            int mid  = low + (high - low) / 2;
8            if(nums[mid] == target){
9                return mid;
10            }
11            else if(nums[mid] <= target){
12                low = mid + 1;
13            }
14            else{
15                high = mid - 1;
16            }
17        }
18        return -1;
19    }
20}                                
21