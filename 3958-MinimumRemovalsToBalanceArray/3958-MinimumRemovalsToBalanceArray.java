// Last updated: 5/8/2025, 10:23:28 pm


class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums); 
        int n = nums.length;
        int maxLen = 0;

        int left = 0;
        for (int right = 0; right < n; right++) {
           
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1); 
        }

        return n - maxLen; 
    }
}
