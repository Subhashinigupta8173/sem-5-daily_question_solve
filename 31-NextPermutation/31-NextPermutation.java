// Last updated: 13/3/2026, 6:36:06 pm
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4         Arrays.sort(candidates);
5        backtrack(candidates, target, 0, new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int[] candidates, int target, int start,
10                           List<Integer> current, List<List<Integer>> result) {
11
12        if (target == 0) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        
18        for (int i = start; i < candidates.length; i++) {
19
20            if(i > start && candidates[i] == candidates[i-1])
21                continue;
22
23            if(candidates[i] > target)
24                break;
25            current.add(candidates[i]); // choose
26            backtrack(candidates, target - candidates[i], i+1, current, result);
27            current.remove(current.size() - 1); // backtrack
28        }
29        
30    }
31}