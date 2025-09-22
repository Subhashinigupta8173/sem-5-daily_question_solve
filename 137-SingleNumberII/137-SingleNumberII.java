// Last updated: 22/9/2025, 9:19:00 pm
class NumArray {
    private int[] prefix; // stores prefix sums

    public NumArray(int[] nums) {
        int n = nums.length;
        prefix = new int[n + 1]; // prefix[0] = 0
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i]; // build prefix sum
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left]; // O(1) query
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */