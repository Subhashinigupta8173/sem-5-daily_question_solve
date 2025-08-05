// Last updated: 5/8/2025, 10:24:28 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
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
        int result = solution.findMaxConsecutiveOnes(nums);

        System.out.println( result);
    }
}
