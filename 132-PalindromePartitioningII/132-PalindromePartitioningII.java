// Last updated: 21/8/2026, 11:21:32 am
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        int n = nums.length;
4        if( n < 2){
5            return n;
6        }
7        int c =  1;
8        int prevdiff = 0;
9        for(int  i = 1; i <n;i++){
10            int diff = nums[i] - nums[i-1];
11            if((diff > 0 && prevdiff <= 0) || (diff < 0 && prevdiff >= 0 )){
12                c++;
13                prevdiff = diff;
14            }
15        }
16        return c;
17
18        
19    }
20}