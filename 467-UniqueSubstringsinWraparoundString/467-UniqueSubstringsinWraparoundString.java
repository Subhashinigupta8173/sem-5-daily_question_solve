// Last updated: 2/10/2026, 12:14:35 pm
1class Solution {
2    public int findSubstringInWraproundString(String s) {
3       int [] dp = new int[26];
4       int len = 0;
5       for(int i = 0; i < s.length(); i++){
6        if(i > 0 && (s.charAt(i) == s.charAt(i - 1) + 1 || (s.charAt(i - 1) == 'z' && s.charAt(i) == 'a'))){
7            len++;
8        }
9        else{
10            len = 1;
11        }
12        int index = s.charAt(i) - 'a';
13        dp[index] = Math.max(dp[index], len);
14       }
15       int ans = 0;
16       for(int x : dp){
17        ans += x;
18       }
19       return ans;
20        
21    
22    }
23
24}