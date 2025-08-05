// Last updated: 5/8/2025, 10:25:39 pm
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; 
        else if (remain == 0) result.add(new ArrayList<>(tempList)); 
        else { 
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i);
                tempList.remove(tempList.size() - 1); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println();
            return;
        }

        int[] candidates = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }

      
        int target = scanner.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);

        System.out.println(result);
    }
}
