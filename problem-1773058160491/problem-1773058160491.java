// Last updated: 9/3/2026, 5:39:20 pm
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        
4        Arrays.sort(nums);
5        int closest = nums[0] + nums[1] + nums[2];
6        
7        for(int i = 0; i < nums.length - 2; i++){
8            
9            int j = i + 1;
10            int k = nums.length - 1;
11            
12            while(j < k){
13                
14                int sum = nums[i] + nums[j] + nums[k];
15                
16                if(Math.abs(sum - target) < Math.abs(closest - target)){
17                    closest = sum;
18                }
19                
20                if(sum < target){
21                    j++;
22                }
23                else if(sum > target){
24                    k--;
25                }
26                else{
27                    return sum;
28                }
29            }
30        }
31        
32        return closest;
33    }
34}