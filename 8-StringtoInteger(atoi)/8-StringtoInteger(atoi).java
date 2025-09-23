// Last updated: 23/9/2025, 11:49:40 pm

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> result) {
        // If combination size reaches k, add it to result
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Try each number from start to n
        for (int i = start; i <= n; i++) {
            temp.add(i);                    // Choose number i
            backtrack(i + 1, n, k, temp, result); // Recurse
            temp.remove(temp.size() - 1);   // Backtrack
        }
    }
}
