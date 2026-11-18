// Last updated: 18/11/2026, 6:07:47 pm
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
3        TreeSet<Long> set = new TreeSet<>();
4        for(int i = 0; i < nums.length; i++){
5            Long num  = new Long(nums[i]);
6            Long floor = set.floor(num);
7            Long ceil = set.ceiling(num);
8            if(floor != null && Math.abs(floor - num) <= valueDiff){
9                return true;
10            }
11            if(ceil != null &&  Math.abs(ceil - num) <= valueDiff){
12                return true;
13            }
14            set.add(num);
15            if(set.size() > indexDiff){
16                set.remove(1L * nums[i - indexDiff]);
17            }
18        }
19        return false;
20        
21    }
22}