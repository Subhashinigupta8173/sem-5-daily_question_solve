// Last updated: 23/9/2026, 6:01:40 pm
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int maxweight = -1;
4        int totalweight = 0;
5        for(int weight : weights){
6            maxweight = Math.max(maxweight,weight);
7            totalweight += weight;
8        }
9        int left = maxweight;
10        int right = totalweight;
11        while(left < right){
12            int mid = left + (right - left) / 2;
13            int day  = 1;
14            int currentweight = 0;
15            for(int w : weights){
16                if(w + currentweight > mid){
17                    day++;
18                    currentweight = 0;
19                }
20                currentweight += w;
21
22
23            }
24            if(day > days){
25                left = mid + 1;
26            }
27            else{
28                right = mid;
29            }
30        }
31        return left;
32    }
33}