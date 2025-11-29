// Last updated: 29/11/2025, 7:28:13 pm
1class Solution {
2    public int smallestDistancePair(int[] nums, int k) {
3       Arrays.sort(nums);
4       int left=0,right=nums[nums.length-1]-nums[0];
5       int ans=0;
6       while(left<=right){
7        int mid=left+(right-left)/2;
8        if(Count(nums,mid)>=k){
9            ans=mid;
10            right=mid-1;
11
12        }
13        else{
14            left=mid+1;
15        }
16       }
17       return  ans;
18    }
19     private static int  Count(int[] nums,int maxDiff){
20        int c=0;
21        int j=0;
22        for(int i=0; i<nums.length; i++){
23            while(j<nums.length && nums[j]-nums[i]<=maxDiff){
24            j++;
25
26        }
27        c+=j-i-1;  
28        }
29        return c;
30    }
31}