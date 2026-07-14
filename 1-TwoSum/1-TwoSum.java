// Last updated: 14/7/2026, 9:26:28 am
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer,Integer>num_map=new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            int complement =target-nums[i];
6            if(num_map.containsKey(complement)){
7                return new int[] {num_map.get(complement),i};
8
9            }
10            num_map.put(nums[i],i);
11        }
12        throw new IllegalArgumentException("no match found!");
13        
14    }
15}