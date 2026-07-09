// Last updated: 8/7/2026, 10:42:52 pm
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        for (int num : map.keySet()) {
8            if(map.get(num) == 1) {
9                return num;
10            }
11        }
12        return -1;
13
14   }
15}
16       
17        
18    
19