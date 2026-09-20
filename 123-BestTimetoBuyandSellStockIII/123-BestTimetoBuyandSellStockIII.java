// Last updated: 20/9/2026, 11:23:14 pm
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int [] left  = new int [n];
5        int [] right = new int [n];
6        int minPrice  = prices[0];
7        for(int i = 1; i < n ;i++){
8            minPrice = Math.min(minPrice,prices[i]);
9            left[i] = Math.max(left[i - 1],prices[i] - minPrice);
10
11        }
12        int maxPrice = prices[n - 1];
13        for(int i = n - 2; i >= 0; i--){
14            maxPrice = Math.max(maxPrice, prices[i]);
15            right[i] = Math.max(right[i + 1],maxPrice - prices[i]);
16
17        }
18        int ans  = 0;
19        for(int i = 0; i < n; i++){
20            ans =  Math.max(ans,left[i] + right[i]);
21
22        }
23        return ans;
24       
25    }
26}