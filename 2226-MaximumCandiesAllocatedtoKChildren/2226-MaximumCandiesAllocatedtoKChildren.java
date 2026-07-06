// Last updated: 6/7/2026, 12:21:54 pm
1class Solution {
2    public int maximumCandies(int[] candies, long k) {
3        int n=candies.length;
4        long sum = candies[0];
5        int max = candies[0];
6        for(int i=1;i<n;i++){
7            max=Math.max(max,candies[i]);
8            sum+=candies[i];
9        }
10        if(sum<k){
11            return 0;
12        }
13        int low = 1;
14        int high = max;
15        while(low<=high){
16            int mid=low+(high-low)/2;
17            if(CanDistribute(candies,k,mid)){
18                low=mid+1;
19            }
20            else{
21                high=mid-1;
22            }
23        }
24        return high;
25    }
26    public static boolean CanDistribute(int [] candies ,long k,int c ){
27        int n=candies.length;
28        long child=0;
29        for(int i=0;i<n;i++){
30            child+=candies[i]/c; 
31        }
32        return  child>=k;
33
34    }
35}