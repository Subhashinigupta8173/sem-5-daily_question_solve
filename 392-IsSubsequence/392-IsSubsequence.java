// Last updated: 21/8/2026, 7:40:56 am
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int n = s.length();
4        int m = t.length();
5        int i = 0;
6        int j = 0;
7        while( i < n && j < m){
8             if(s.charAt(i) == t.charAt(j)){
9                i++;
10                j++; 
11            
12            }
13            else {
14                j++;
15
16            }
17
18        }
19        return i == n;
20       
21       
22
23        
24    }
25}