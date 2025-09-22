// Last updated: 22/9/2025, 9:10:35 pm
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // iterate over all 32 bits
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            // set the i-th bit of result
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
