// Last updated: 22/9/2025, 9:02:18 pm
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort to handle duplicates
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> tempList, List<List<Integer>> result) {
        result.add(new ArrayList<>(tempList)); // add current subset

        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            tempList.add(nums[i]);             // choose
            backtrack(nums, i + 1, tempList, result); // explore
            tempList.remove(tempList.size() - 1);     // un-choose (backtrack)
        }
    }
}

