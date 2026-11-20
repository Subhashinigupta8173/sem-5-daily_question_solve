// Last updated: 20/11/2026, 11:32:55 am
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
13        for(int i = n-1; i>=0; i--){
14            for(int inc = 0; inc <= 1; inc++){
15                int curr = nums[i] + inc;
16                int len = 1;
17                int j = FindCurrent(nums, i + 1, curr + 1);
18                if (j != -1) {
19                    len = Math.max(len, 1 + dp[j][0]);
20                }
21                j = FindCurrent(nums, i + 1, curr);
22
23                if (j != -1) {
24                    len = Math.max(len, 1 + dp[j][1]);
25                }     
26                dp[i][inc] = len;
27                result = Math.max(result,len);
28
29
30 
31            }
32        }
33
34        return result;
35    }
36    public static int FindCurrent(int[] nums, int i, int target) {
37        int ans = -1;
38        int n = nums.length;
39
40        while (i < n) {
41            int mid = i + (n - i) / 2;
42
43            if (nums[mid] == target) {
44                ans = mid;
45                n = mid;
46            } else if (nums[mid] < target) {
47                i = mid + 1;
48            } else {
49                n = mid;
50            }
51        }
52
53        return ans;
54    }
55}