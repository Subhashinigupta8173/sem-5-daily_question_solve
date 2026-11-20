// Last updated: 20/11/2026, 4:04:27 pm
1class Solution {
2    public int numOfSubarrays(int[] arr) {
3        int mod = 1000000007;
4        int even_count = 1;
5        int odd_count = 0;
6        int sum = 0;
7        long result = 0;
8        for (int num : arr) {
9            sum += num;
10            if (sum % 2 == 0) {
11                result = (result + odd_count) % mod;
12                even_count++;
13            }
14            else {
15                result = (result + even_count) % mod;
16                odd_count++;
17            }
18        }
19        return (int) result;
20    }
21}