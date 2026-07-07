// Last updated: 6/7/2026, 10:02:43 pm
1class Solution {
2    public int findMin(int[] nums) {
3         int low = 0;
4        int high = nums.length-1;
5        while(low < high){
6            int mid = low+(high-low)/2;
7            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
8                low++;
9                high--;
10            }
11             else if(nums[mid] > nums[high]){
12                low = mid+1;
13            }
14            else{
15            high = mid;
16            }
17        }
18        return nums[low];
19
20        
21        
22    }
23}