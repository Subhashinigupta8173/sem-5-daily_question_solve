// Last updated: 11/1/2026, 8:45:06 am
1
2class Solution {
3    public int centeredSubarrays(int[] nums) {
4        int [] arr=nums;
5        int n=arr.length;
6        int c=n;
7
8        for(int i=0; i<n;i++){
9            int sum=arr[i];
10            for(int j=i+1; j<n; j++){
11                sum+=arr[j] ;
12                for(int k=i; k<=j; k++){
13                    if(arr[k]==sum){
14                         c++;
15                         break;  
16                        
17                    }
18                                 
19                }
20            }
21        }
22        return c;
23        
24        
25    }
26}