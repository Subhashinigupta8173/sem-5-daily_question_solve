// Last updated: 13/7/2026, 11:39:03 am
1class Solution {
2
3    Boolean[][] dp;
4
5    public boolean canPartition(int[] arr) {
6
7        int sum = 0;
8
9        for (int x : arr)
10            sum += x;
11
12        if (sum % 2 != 0)
13            return false;
14
15        int target = sum / 2;
16
17        dp = new Boolean[arr.length][target + 1];
18
19        return Subsetsum(arr, arr.length - 1, target);
20    }
21
22    public boolean Subsetsum(int[] arr, int index, int target) {
23
24        if (target == 0)
25            return true;
26
27        if (index < 0 || target < 0)
28            return false;
29
30        if (dp[index][target] != null)
31            return dp[index][target];
32
33        boolean take = Subsetsum(arr, index - 1, target - arr[index]);
34        boolean notTake = Subsetsum(arr, index - 1, target);
35
36        dp[index][target] = take || notTake;
37
38        return dp[index][target];
39    }
40}