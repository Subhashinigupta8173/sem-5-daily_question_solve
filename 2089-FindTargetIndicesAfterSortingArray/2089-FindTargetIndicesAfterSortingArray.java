// Last updated: 19/10/2026, 10:02:41 pm
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int lt = 0, eq = 0;
4        for (int x : nums) {
5            if (x < target) lt++;
6            else if (x == target) eq++;
7        }
8        List<Integer> res = new ArrayList<>(eq);
9        for (int i = 0; i < eq; i++) res.add(lt + i);
10        return res;
11    }
12}