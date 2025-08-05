// Last updated: 5/8/2025, 10:24:57 pm
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(nums[i]) && (i - numToIndex.get(nums[i]) <= k)) {
                return true;
            }
            numToIndex.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println();
            return;
        }

        int[] nums = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        Solution solution = new Solution();
        boolean result = solution.containsNearbyDuplicate(nums, k);

        System.out.print( result);
    }
}
