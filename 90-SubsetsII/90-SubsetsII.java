// Last updated: 7/9/2026, 10:27:47 pm
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums); // Step 1: sort to handle duplicates
5        backtrack(nums, 0, new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int[] nums, int start, List<Integer> tempList, List<List<Integer>> result) {
10        result.add(new ArrayList<>(tempList)); // add current subset
11
12        for (int i = start; i < nums.length; i++) {
13            // skip duplicates
14            if (i > start && nums[i] == nums[i - 1]) continue;
15
16            tempList.add(nums[i]);             // choose
17            backtrack(nums, i + 1, tempList, result); // explore
18            tempList.remove(tempList.size() - 1);     // un-choose (backtrack)
19        }
20    }
21}
22
23