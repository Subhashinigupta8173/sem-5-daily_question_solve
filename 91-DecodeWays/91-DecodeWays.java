// Last updated: 16/1/2026, 3:02:50 pm
1class Solution {
2     int []dp;
3    public int numDecodings(String s) {
4        dp=new int[s.length()];
5        Arrays.fill(dp,-1);
6        return solve(0,s);
7    }
8    private int solve(int i,String s){
9        int n=s.length();
10        if(i==n) return 1;
11        //Base case
12        if(s.charAt(i)=='0') return 0;
13
14        //already calculated
15        if(dp[i]!=-1) return dp[i];
16         // 1 digit 
17         int ways=0;
18         ways+=solve(i+1,s);
19         //2  digits
20         if(i+1 <n){
21            int val=Integer.parseInt(s.substring(i,i+2));
22            if(val>=10 && val<=26){
23                ways+=solve(i+2,s);
24            }
25         }
26         return dp[i]=ways;
27    }
28
29}