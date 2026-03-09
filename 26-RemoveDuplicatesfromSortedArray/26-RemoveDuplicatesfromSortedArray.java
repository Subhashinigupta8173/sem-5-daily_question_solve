// Last updated: 9/3/2026, 5:54:42 pm
1
2class Solution {
3    public int removeDuplicates(int[] nums) {
4        
5        int k = 1;   
6        
7        for(int i = 1; i < nums.length; i++){
8            
9            if(nums[i] != nums[i-1]){
10                nums[k] = nums[i];
11                k++;
12            }
13        }
14        
15        return k;
16    }
17}