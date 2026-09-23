// Last updated: 23/9/2026, 7:09:35 pm
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int n  = nums.length;
4        int lower =  Integer.MIN_VALUE;
5        int high = 0;
6        if(n < k){
7            return 0;
8        }
9        for(int num : nums){
10            lower = Math.max(lower , num);
11            high += num;
12        }
13        int Kcal = 0;
14        
15        while(lower <= high){
16            int mid = lower + (high - lower) / 2;
17            if(canFit(nums,mid,k)){
18                Kcal = mid;
19                high = mid - 1;
20            }
21            else{
22                lower = mid + 1;
23            }
24        }
25        return Kcal;
26
27    }
28    public boolean canFit(int [] nums ,int mid ,int k){
29        int c = 1;
30        int sum = 0;
31        for(int num : nums){
32            if(sum + num > mid){
33                c++;
34                sum = num;
35            }
36            else{
37                sum += num;
38            }
39        }
40        return c <= k;
41    }
42}