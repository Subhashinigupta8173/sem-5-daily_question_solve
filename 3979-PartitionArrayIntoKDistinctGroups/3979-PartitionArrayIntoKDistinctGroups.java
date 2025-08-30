// Last updated: 30/8/2025, 8:24:17 pm
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0) return false;
        int g=n/k;
        Arrays.sort(nums);
        int c=1;
        for(int i=1; i<n;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else{
                if(c>g) return false;
                c=1;
            }
        }
        if(c>g) return false;
        return true;
      
        
    }
}