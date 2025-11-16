// Last updated: 16/11/2025, 8:08:44 am
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
       
        
    }
}