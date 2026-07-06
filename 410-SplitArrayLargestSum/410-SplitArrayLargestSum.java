// Last updated: 6/7/2026, 11:43:23 am
1class Solution {
2    public int splitArray(int[] arr, int k) {
3        int totalsum=arr[0];
4        int max=arr[0];
5        for(int i=1;i<arr.length;i++){
6            totalsum+=arr[i];
7            max=Math.max(max,arr[i]);
8        }
9        int low=max;
10        int h=totalsum;
11        while(low<=h){
12            int mid= low+(h-low)/2;
13            if(Cansplit(arr,k,mid)){
14                h=mid-1;
15            }
16            else{
17                low=mid+1;
18            }
19        }
20        return low;
21
22    }
23
24    public static boolean Cansplit (int [] arr,int k,int t){
25        int sum=0;
26        int p=1;
27        for(int i=0;i<arr.length;i++){
28            if(sum+arr[i]>t){
29                p++;
30                sum=arr[i];
31            }
32            else{
33                sum+=arr[i];
34            }
35
36        }
37        return p<=k;
38    }
39       
40}