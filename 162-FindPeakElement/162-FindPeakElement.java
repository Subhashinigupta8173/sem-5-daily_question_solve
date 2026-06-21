// Last updated: 21/6/2026, 11:22:08 pm
1class Solution {
2    public int findPeakElement(int[] arr) {
3        int n=arr.length;
4        int max=Integer.MIN_VALUE;
5        int ans=0;
6        for(int i=0;i<n; i++){
7        
8        if(arr[i]>max){
9            max=arr[i];
10            ans=i;
11
12        }
13        
14        }
15        return ans;
16        
17    }
18}