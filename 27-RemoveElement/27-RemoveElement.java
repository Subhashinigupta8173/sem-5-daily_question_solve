// Last updated: 14/3/2026, 3:33:44 pm
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        
4        int c=0;
5        for(int i=0; i<nums.length; i++){
6            
7            if(nums[i]!=val){
8                
9                nums[c]=nums[i];
10
11               
12
13                c++;
14            }
15        }
16        return c;
17        
18    }
19}