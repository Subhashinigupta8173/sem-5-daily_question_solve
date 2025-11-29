// Last updated: 29/11/2025, 6:28:41 pm
1class Solution {
2    public int findKthNumber(int m, int n, int k) {
3        int l=1,h=m*n, ans=0;
4        while(l<=h){
5            int mid=l+(h-l)/2;
6            if(count(mid,m,n)>=k){
7                ans=mid;
8                h=mid-1;
9            }
10            else{
11                l=mid+1;
12
13            }
14        }
15        return ans;
16        
17       
18    }
19    private int count(int x,int m,int n){
20        int c=0;
21        for(int i=1;i<=m; i++){
22            c+=Math.min(x/i,n);
23        }
24        return c ;
25    }
26}