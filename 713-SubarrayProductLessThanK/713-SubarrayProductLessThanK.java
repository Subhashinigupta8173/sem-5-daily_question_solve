// Last updated: 5/8/2025, 10:24:18 pm
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p=1;
		int si=0;
		int ei=0;
		int ans=0;
		while(ei<nums.length) {
			//grow
			p=p*nums[ei];
			//shrink
			while(p>=k && si<=ei) {
				p=p/nums[si];
				si++;
				
			}
			//ans update
			ans=ans+(ei-si+1);
			ei++;
		}
		return ans;
        
    }

}