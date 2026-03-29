// Last updated: 29/3/2026, 8:05:58 am
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int n=s.length();
4        
5        for(int i=0; i<n; i++){
6            if(s.charAt(i)==s.charAt(n-i-1)){
7                return i;
8              
9            }
10            
11        }
12      
13            
14        
15        return -1;
16       
17    }
18}