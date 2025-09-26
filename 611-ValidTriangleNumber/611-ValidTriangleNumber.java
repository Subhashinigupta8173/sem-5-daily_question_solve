// Last updated: 26/9/2025, 10:53:55 pm
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--; // shrink window
                } else {
                    i++; // need bigger sum
                }
            }
        }
        return count;
        
    }
}