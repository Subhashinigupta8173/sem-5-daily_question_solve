// Last updated: 5/8/2025, 10:26:02 pm
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum; 
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println();
            return;
        }

        int[] nums = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.threeSumClosest(nums, target);

        System.out.println( result);
    }
}
