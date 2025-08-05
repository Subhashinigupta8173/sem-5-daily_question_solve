// Last updated: 5/8/2025, 10:25:30 pm
import java.util.Scanner;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
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

        Solution solution = new Solution();
        int maxSum = solution.maxSubArray(nums);

        System.out.println(maxSum);
    }
}
