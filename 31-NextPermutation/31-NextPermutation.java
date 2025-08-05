// Last updated: 5/8/2025, 10:25:47 pm
class Solution {
    public void nextPermutation(int[] nums) {
        int k = -1;

        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }

        
        if (k == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

       
        int l = -1;
        for (int i = nums.length - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                l = i;
                break;
            }
        }

        
        int temp = nums[k];
        nums[k] = nums[l];
        nums[l] = temp;

        
        reverse(nums, k + 1, nums.length - 1);
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

        Solution solution = new Solution();
        solution.nextPermutation(nums);

        System.out.println( Arrays.toString(nums));
    }
}
