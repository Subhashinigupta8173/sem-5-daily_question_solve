// Last updated: 21/6/2026, 11:56:59 pm
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        int i=0;
5        int j=i+1;;
6        Arrays.sort(nums);
7        int ans=0;
8        while(i<j && j<n){
9            if(nums[i]==nums[j]){
10                ans= nums[j];
11
12            }
13           i++;
14           j++;
15           if(j==n-1){
16            if(nums[j]==nums[j-1]){
17            ans= nums[j-1];
18           }
19
20        }
21        }
22        return ans;
23    }
24}