// Last updated: 13/3/2026, 5:41:02 pm
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i=nums.length-2;
4        //find pivot value means jo next greater se just small ai
5        while(i>=0 && nums[i]>=nums[i+1]){
6            i--;
7        }
8        // find next greater value to swap 
9        if(i>=0){
10        int j=nums.length-1;
11        while( nums[j]<=nums[i]){
12            j--;
13        }
14        //swap them
15        int temp=nums[i];
16        nums[i]=nums[j];
17        nums[j]=temp;
18        
19    }
20    // reverse whole array after the i
21    reverse(nums,i+1);
22    }
23      private void reverse(int[] nums, int start) {
24        int end = nums.length - 1;
25
26        while (start < end) {
27            int temp = nums[start];
28            nums[start] = nums[end];
29            nums[end] = temp;
30
31            start++;
32            end--;
33        }
34     }
35}