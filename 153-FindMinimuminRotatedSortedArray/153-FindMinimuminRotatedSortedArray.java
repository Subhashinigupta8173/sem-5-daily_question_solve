// Last updated: 6/7/2026, 9:22:29 pm
1class Solution {
2    public int findMin(int[] nums) {
3        
4        int low = 0;
5        int high = nums.length-1;
6        while(low < high){
7            int mid = low+(high-low)/2;
8            if(nums[mid] > nums[high]){
9                low = mid+1;
10            }
11            else{
12            high = mid;
13            }
14        }
15        return nums[low];
16
17        
18    }
19}