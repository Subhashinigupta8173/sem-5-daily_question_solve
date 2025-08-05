// Last updated: 5/8/2025, 10:24:47 pm
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
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

        int[] nums = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}
