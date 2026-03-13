// Last updated: 13/3/2026, 7:10:55 pm
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(int[] candidates, int target, int start,
9                           List<Integer> current, List<List<Integer>> result) {
10
11        if (target == 0) {
12            result.add(new ArrayList<>(current));
13            return;
14        }
15
16        if (target < 0) {
17            return;
18        }
19        for (int i = start; i < candidates.length; i++) {
20            current.add(candidates[i]); // choose
21            backtrack(candidates, target - candidates[i], i, current, result);
22            current.remove(current.size() - 1); // backtrack
23        }
24    }
25}