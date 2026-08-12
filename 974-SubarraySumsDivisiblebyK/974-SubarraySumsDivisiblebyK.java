// Last updated: 12/8/2026, 8:36:40 am
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3
4        int[] freq = new int[k];
5
6        
7        freq[0] = 1;
8
9        int sum = 0;
10        int ans = 0;
11
12        for (int num : nums) {
13
14            sum += num;
15
16            int rem = sum % k;
17
18           
19            if (rem < 0) {
20                rem += k;
21            }
22
23           
24            ans += freq[rem];
25
26         
27            freq[rem]++;
28        }
29
30        return ans;
31    }
32}