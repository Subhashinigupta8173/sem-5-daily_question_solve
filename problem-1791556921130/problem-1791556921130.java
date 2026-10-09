// Last updated: 9/10/2026, 8:12:01 pm
1
2class Solution {
3    public int[] topKFrequent(int[] nums, int k) {
4        int[] arr = new int[k];
5        HashMap<Integer, Integer> map = new HashMap<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
9        }
10
11        List<Integer> ll = new ArrayList<>(map.keySet());
12
13        ll.sort((a, b) -> map.get(b) - map.get(a));
14
15        for (int i = 0; i < k; i++) {
16            arr[i] = ll.get(i);
17        }
18
19        return arr;
20    }
21}