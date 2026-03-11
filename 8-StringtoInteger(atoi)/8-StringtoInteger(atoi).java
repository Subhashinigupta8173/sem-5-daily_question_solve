// Last updated: 11/3/2026, 7:06:21 pm
1class Solution {
2    public boolean isPalindrome(int x) {
3        int ans=x;
4        int rev=0;
5        if(x<0){
6            return false;
7        }
8        while(x!=0){
9            int d=x%10;
10            rev=rev*10+d;
11            x=x/10;
12        }
13        return rev==ans;
14    }
15}