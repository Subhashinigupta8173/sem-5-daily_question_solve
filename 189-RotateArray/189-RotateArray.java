// Last updated: 5/8/2025, 10:25:05 pm
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
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
        int k = scanner.nextInt();

        Solution solution = new Solution();
        solution.rotate(nums, k);

        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}
