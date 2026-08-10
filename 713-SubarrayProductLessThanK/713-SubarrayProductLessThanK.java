// Last updated: 9/8/2026, 9:33:32 pm
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int n = nums.length;
4        int c = 0;
5        for(int i = 0 ;i < n; i++){
6            int p =1;
7           
8            for(int  j = i; j < n;j++){
9                p = p*nums[j];
10                if(p < k ){
11                    c++;
12                }
13                else{
14                    break;
15                }
16                
17            }
18
19        }
20        return c;
21
22        
23    }
24}