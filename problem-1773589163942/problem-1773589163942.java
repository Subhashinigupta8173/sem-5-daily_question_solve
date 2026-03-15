// Last updated: 15/3/2026, 9:09:23 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int [] arr=new int[2];
4        int sum=0;
5        for(int i=0; i<nums.length+1; i++){
6            for(int j=i+1; j<nums.length; j++){
7                sum=nums[i]+nums[j];
8            if(sum==target){
9                arr[0]=i;
10                arr[1]=j;
11                break;
12
13            }
14        }
15
16            }
17            
18        return arr;
19    }
20}