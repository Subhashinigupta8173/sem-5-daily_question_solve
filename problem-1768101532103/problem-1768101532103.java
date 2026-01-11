// Last updated: 11/1/2026, 8:48:52 am
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        int n=nums.length;
4        int c=n;
5        
6        for(int i=0;i<n;i++){
7            int sum=nums[i];
8            for(int j=i+1;j<n; j++){
9                sum+=nums[j];
10                for(int k=i; k<=j;k++){
11                    if(sum==nums[k]){
12                    c++;
13                        break;
14                }
15                
16                    
17            }
18                
19                
20            }
21        }
22        return c;
23        
24    }
25}
26