// Last updated: 2/9/2025, 11:20:35 pm
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }


        xor ^= n;

        return xor;
    }
}
