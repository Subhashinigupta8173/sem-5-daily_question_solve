// Last updated: 9/10/2026, 8:01:42 pm
1
2class Solution {
3    public List<Integer> majorityElement(int[] nums) {
4        List<Integer> ll = new LinkedList<>();
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        int n = nums.length;
8        int c = n / 3;
9
10        for (int i = 0; i < nums.length; i++) {
11            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
12        }
13
14        for (int key : map.keySet()) {
15            int ans = map.get(key);
16
17            if (ans > c) {
18                ll.add(key);
19            }
20        }
21
22        return ll;
23    }
24}