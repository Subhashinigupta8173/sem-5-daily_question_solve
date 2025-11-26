// Last updated: 26/11/2025, 10:15:54 pm
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n=nums.length;
4        int j=0;
5        int k=n-1;
6        int []arr=new int[n];
7        for(int i=0; i<n; i++){
8            if(nums[i]%2==0){
9                arr[j]=nums[i];
10                j++;
11
12            }
13            else{
14                arr[k]=nums[i];
15                k--;
16            }
17
18        }
19        return arr;
20        
21    }
22}