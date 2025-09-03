// Last updated: 3/9/2025, 7:58:39 am
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;  
        }
        return result;
    }
}
