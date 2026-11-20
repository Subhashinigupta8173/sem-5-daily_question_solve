// Last updated: 20/11/2026, 11:21:36 am
1class Solution {
2    int [][]dp;
3    public int maxSelectedElements(int[] nums) {
4    
5        int n = nums.length;
6        Arrays.sort(nums);
7        dp = new int[n+1][2];
8        int result = 1;
9        for(int i = 0; i <= n; i++){
10            Arrays.fill(dp[i] , -1);
11        }
12
13        for (int i = 0; i < n; i++) {
14            result = Math.max(result,
15                    Math.max(Solve(i, 0, nums), Solve(i, 1, nums)));
16        }
17
18        return result;
19    }
20
21    public  int Solve(int i, int inc, int[] nums) {
22        if(dp[i][inc] != -1){
23            return dp[i][inc];
24        }
25        int curr = nums[i] + inc;
26        int len = 1;
27
28        // Option 1: Find curr + 1
29        int j = FindCurrent(nums, i + 1, curr + 1);
30
31        if (j != -1) {
32            len = Math.max(len, 1 + Solve(j, 0, nums));
33        }
34
35        // Option 2: Find curr
36        j = FindCurrent(nums, i + 1, curr);
37
38        if (j != -1) {
39            len = Math.max(len, 1 + Solve(j, 1, nums));
40        }
41
42        return dp[i][inc] = len;
43    }
44
45    public static int FindCurrent(int[] nums, int i, int target) {
46        int ans = -1;
47        int n = nums.length;
48
49        while (i < n) {
50            int mid = i + (n - i) / 2;
51
52            if (nums[mid] == target) {
53                ans = mid;
54                n = mid;
55            } else if (nums[mid] < target) {
56                i = mid + 1;
57            } else {
58                n = mid;
59            }
60        }
61
62        return ans;
63    }
64}