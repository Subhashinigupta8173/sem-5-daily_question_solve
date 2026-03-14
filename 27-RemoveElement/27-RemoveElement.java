// Last updated: 14/3/2026, 5:50:56 pm
1class Solution {
2    public int trap(int[] height) {
3
4        int n = height.length;
5
6        int[] leftMax = new int[n];
7        int[] rightMax = new int[n];
8
9        leftMax[0] = height[0];
10        for(int i = 1; i < n; i++){
11            leftMax[i] = Math.max(leftMax[i-1], height[i]);
12        }
13
14        rightMax[n-1] = height[n-1];
15        for(int i = n-2; i >= 0; i--){
16            rightMax[i] = Math.max(rightMax[i+1], height[i]);
17        }
18
19        int water = 0;
20
21        for(int i = 0; i < n; i++){
22            water += Math.min(leftMax[i], rightMax[i]) - height[i];
23        }
24
25        return water;
26    }
27}