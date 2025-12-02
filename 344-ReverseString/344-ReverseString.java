// Last updated: 2/12/2025, 11:02:23 pm
1class Solution {
2    public void reverseString(char[] s) {
3        int l=0;
4        int r=s.length-1;
5        while(l<r){
6            char ch=s[l];
7            s[l]=s[r];
8            s[r]=ch;
9
10            l++;
11            r--;
12        }
13
14
15
16
17
18        
19    }
20}